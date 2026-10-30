class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,res=Integer.MIN_VALUE;
        Map<Integer,Integer> b = new HashMap<>();
        for(int h=0;h<fruits.length;h++){
            b.put(fruits[h],b.getOrDefault(fruits[h],0)+1);
            while(b.size()>2){
                b.put(fruits[l],b.getOrDefault(fruits[l],0)-1);
                if(b.get(fruits[l])==0){
                    b.remove(fruits[l]);
                }
                l++;
            }
            int c=h-l+1;
            res=Math.max(c,res);
        }
        return res;
    }
}