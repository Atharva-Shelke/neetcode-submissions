class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    op.add(triplet);
                    l++;
                    r--;
                    while(l<nums.length && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(r>=0 && nums[r]==nums[r+1]){
                        r--;
                    }
                }
                else if(sum<0){
                    l++;
                    // if(nums[l]==nums[l-1]){
                    //     l++;
                    // }
                }
                else{
                    r--;
                    // if(nums[r]==nums[r+1]){
                    //     r--;
                    // }
                }             
            }
        }
        return op;
    }
}
