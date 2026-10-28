class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int f = target - nums[i];
            if(map.containsKey(f) && i!=map.get(f)){
                return new int[]{Math.min(i,map.get(f)),Math.max(i,map.get(f))};
            }
        }
        return new int[0];
    }
}
