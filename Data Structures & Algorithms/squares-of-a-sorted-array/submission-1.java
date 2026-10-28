class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,p=nums.length-1;
        int[] op = new int[nums.length];

        while(l<=r){
            int l2 = nums[l]*nums[l];
            int r2 = nums[r]*nums[r];

            if(l2>r2){
                op[p--]=l2;
                l++;
            }
            else {
                op[p--]=r2;
                r--;
            }

        }
        return op;
    }
}