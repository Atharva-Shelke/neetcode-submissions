class Solution {
    public void sortColors(int[] nums) {
        int []f = new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                f[0]++;
            }
            else if(nums[i]==1){
                f[1]++;
            }
            else{
                f[2]++;
            }
        }
        int id=0;
        for(int i=0;i<f[0];i++){
            nums[i]=0;
            id++;
        }
        for(int i=0;i<f[1];i++){
            nums[id]=1;
            id++;
        }
        for(int i=0;i<f[2];i++){
            nums[id]=2;
            id++;
        }
    }
}