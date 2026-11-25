class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,rem=0,res=0;
        map.put(sum,1);
        for(int n:nums){
            sum+=n;
            rem=sum%k;
            res+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return res;
    }
}