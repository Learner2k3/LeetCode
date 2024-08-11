class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //4,1,2    1,3,4,2   -1,3,-1
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums2.length; i++){
            map.put(nums2[i],i);
        }
        for(int i = 0; i<nums1.length; i++){
            res[i] = getGreatElement(nums2, map.get(nums1[i]));
        }
        return res;      
    }
    public static int getGreatElement(int[] nums, int index){
        int curMax = nums[index];
        for(int i = index; i<nums.length; i++){
            if(curMax<nums[i]){ //4,4 
                return nums[i];
            }
        }
        return -1;
    }
}