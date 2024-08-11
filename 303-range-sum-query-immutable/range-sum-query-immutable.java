class NumArray {
    int[] arr;
    public NumArray(int[] nums) {        //[-2,0,3,-5,2,1]
                                            //[-2,-2,1,-4,-2,-3]
        arr=nums;                            
        for(int i =1; i<arr.length; i++){
            arr[i]= nums[i]+nums[i-1];
            }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) 
            return arr[right];
        return arr[right]-arr[left-1];       //-3+2 == -1
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */