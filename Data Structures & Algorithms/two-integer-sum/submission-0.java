class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            int f = target - nums[i];
            for(int n=i+1;n<nums.length;n++){
                if(nums[n]==f){
                    arr[0]=i;
                    arr[1]=n;
                }
            }
        }
        return arr;
    }
}
