class Solution {
    public int findMaxLength(int[] nums) {
        int c0=0;
        int c1=0;
        Map<Integer,Integer> diff_id=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else{
                c1++;
            }
            int diff=c0-c1;
            if(diff==0){
                res=Math.max(res,i+1);
                continue;
            }
            if(diff_id.containsKey(diff)){
                res=Math.max(res,i-diff_id.get(diff));
            }
            else{
                diff_id.put(diff,i);
            }
        }
        return res;
    }
}
