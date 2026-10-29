class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,h=0,res=Integer.MAX_VALUE,sum=0;
        while(h<nums.length){
            sum=sum+nums[h];
            while(sum>=target){
                int s=h-l+1;
                res=Math.min(s,res);
                sum=sum-nums[l];
                l++;
            }
            h++;
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}