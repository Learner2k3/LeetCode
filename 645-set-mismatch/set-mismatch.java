class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for(int num: nums){
            if(set.contains(num)){
                res[0] = num;
            }
            else{
                set.add(num);
            }
        }
        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
                res[1] = i;
            }
        }
        return res;
        
    }
}