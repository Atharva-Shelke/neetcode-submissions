class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }

        int prefix=nums[0];
        int suffix=sum;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                prefix=prefix+nums[i];            
                suffix=sum-prefix+nums[i];
            }
            if(prefix==suffix){
                return i;
            }
        }
        return -1;
    }
}