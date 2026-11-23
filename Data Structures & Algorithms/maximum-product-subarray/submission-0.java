class Solution {
    public int maxProduct(int[] nums) {
        int maxBefore=nums[0];
        int minBefore=nums[0];
        int res=nums[0];

        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=maxBefore*nums[i];
            int v3=minBefore*nums[i];

            maxBefore=Math.max(v1,Math.max(v2,v3));
            minBefore=Math.min(v1,Math.min(v2,v3));
            res=Math.max(res,Math.max(maxBefore,minBefore));
        }
        return res;
    }
}
