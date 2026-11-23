class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int resMax=nums[0];
        int min=nums[0];
        int resMin=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++){
            sum=sum+nums[i];
            int v1=nums[i];

            int vMax=max+nums[i];
            max=Math.max(v1,vMax);
            resMax=Math.max(resMax,max);

            int vMin=min+nums[i];
            min=Math.min(v1,vMin);
            resMin=Math.min(resMin,min);
        }
        return Math.max(resMax,sum==resMin?resMax:sum-resMin);
    }
}