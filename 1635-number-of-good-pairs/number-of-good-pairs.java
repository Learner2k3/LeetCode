class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(int a: map.values()){
            count+=(a*(a-1))/2;
        }
        return count;
    }
}