class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for(int n:nums){
            if(n<0){
                neg.add(n);
            }
            else{
                pos.add(n);
            }
        }

        if(neg.size()==0){
            for(int i=0;i<nums.length;i++){
                nums[i] = nums[i]*nums[i];
            }
            return nums;
        }
        else if(pos.size()==0){
            for(int i=0;i<nums.length;i++){
                nums[i] = nums[i]*nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
        
        int i=0,j=0,id=0;
        int[] op = new int[nums.length];

        for(i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.sort(neg);

        for(i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        i=0;
        while(i<neg.size() && j<pos.size()){
            if(neg.get(i)<=pos.get(j)){
                op[id++]=neg.get(i++);
            }
            else if(neg.get(i)>pos.get(j)){
                op[id++]=pos.get(j++);
            }
        }

        while(i<neg.size()){
            op[id++]=neg.get(i++);
        }

        while(j<pos.size()){
            op[id++]=pos.get(j++);
        }

        return op;

    }
}