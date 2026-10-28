class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] op =new int[nums.length];
        int l=0,r=nums.length-1,id=nums.length-1;

        while(l<=r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                op[id--]=nums[l]*nums[l];
                l++;
            } else{
                op[id--]=nums[r]*nums[r];
                r--;
            }
        }
        return op;
    }
}