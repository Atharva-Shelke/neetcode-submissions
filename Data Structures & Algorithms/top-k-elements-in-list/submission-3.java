class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> f= new HashMap<>();
        for(int num:nums){
            f.put(num,f.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry:f.entrySet()){
            heap.offer(new int[]{entry.getValue(),entry.getKey()});
            if(heap.size()>k){
                heap.poll();
            }
        }

        int op[] = new int[k];
        for(int i=0;i<k;i++){
            op[i]=heap.poll()[1];
        }
        return op;
    }
}
