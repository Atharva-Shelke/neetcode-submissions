class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> f = new HashMap<>();
        for(int n:nums){
            f.put(n,f.getOrDefault(n,0)+1);
        }
        
        List<Integer>[] fa = new List[nums.length+1];
        for(int i=0;i<fa.length;i++){
            fa[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: f.entrySet()){
            fa[entry.getValue()].add(entry.getKey());
        }

        int[] op = new int[k];
        int index =0;
        for(int i=fa.length-1;i>0 && index<k;i--){
            for(int n:fa[i]){
                op[index++]=n;
                if(index==k){
                    return op;
                }
            }
        }
        return op;
    }
}
