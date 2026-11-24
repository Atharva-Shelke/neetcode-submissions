class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int[] sums=new int[this.nums.length];
        sums[0]=this.nums[0];
        for(int i=1;i<sums.length;i++){
            sums[i]=sums[i-1]+this.nums[i];
        }
        if(left==0){
            return sums[right];
        }
        return sums[right]-sums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */