class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            int ans=numbers[i]+numbers[j];
            if(ans==target){
                return new int[]{i+1,j+1};
            }
            else if(ans>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[0];
    }
}
