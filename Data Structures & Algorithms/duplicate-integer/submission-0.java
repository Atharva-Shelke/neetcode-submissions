class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     int x=nums[i];
        //     for (int j=i;j<nums.length;j++){
        //         if(x==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
        Set<Integer> x = new HashSet<>();
        for(int i:nums){
            if(x.contains(i)){
                return true;
            }
            x.add(i);
        }
        return false;

        // return Arrays.stream(nums).distinct().count()<nums.length;
    }
}