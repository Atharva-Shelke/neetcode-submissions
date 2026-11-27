class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        boolean insert = false;
        for(int i=0;i<intervals.length;i++){
            if(!insert && intervals[i][0]>=newInterval[0]){
                res.add(newInterval);
                insert=true;
            }
            res.add(intervals[i]);
        }
        if(!insert){
            res.add(newInterval);
        }
        return merge(res.toArray(new int[res.size()][]));
    }

    static int[][] merge(int[][] toMerge){
        List<int[]> merged=new ArrayList<>();
        int s1=toMerge[0][0];
        int e1=toMerge[0][1];
        for(int i=1;i<toMerge.length;i++){
            int s2=toMerge[i][0];
            int e2=toMerge[i][1];
            if(e1>=s2){
                s1=s1;
                e1=Math.max(e1,e2);
                continue;
            }
            merged.add(new int[]{s1,e1});
            s1=s2;
            e1=e2;
        }
        merged.add(new int[]{s1,e1});
        return merged.toArray(new int[merged.size()][]);
    }
}
