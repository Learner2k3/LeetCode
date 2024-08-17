class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1,2,3,4] (i-1)*      [1,1,2,6]
        //[1,2,3,4] (i+1)*      [24,12,4,1]
    //                         [24,12,8,6]

        int[] preFix = new int[nums.length];
        int[] sufFix = new int[nums.length];
        preFix[0] = 1;
        sufFix[nums.length - 1] = 1;
        for(int i =1; i<nums.length; i++){
            preFix[i] = preFix[i-1]*nums[i-1];
        }
        for(int j = nums.length-2; j>=0; j--){
            sufFix[j] = sufFix[j+1]* nums[j+1];
        }
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = preFix[i]*sufFix[i];
        }
        return ans;
    }
}