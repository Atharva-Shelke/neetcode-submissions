class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pos[][] = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            pos[i][0] = nums[i];
            pos[i][1] = i;
        }
        Arrays.sort(pos,Comparator.comparingInt(a->a[0]));

        int l=0,r=nums.length-1;
        while(l<r){
            int curr = pos[l][0] + pos[r][0];
            if(curr == target){
                return new int[]{Math.min(pos[l][1],pos[r][1]),Math.max(pos[l][1],pos[r][1])};
            }
            else if(curr<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[0];
    }
}
