class Solution {
    public int maxProductDifference(int[] nums) {
       /* Arrays.sort(nums);
        int i =0; 
        int j = nums.length-2;
        int min = nums[i]*nums[i+1];
        int max = nums[j]*nums[j+1];
        return max - min;*/
      int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            // Update max1 and max2
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update min1 and min2
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
        }
    }
         return (max1*max2)-(min1*min2);
    }
}