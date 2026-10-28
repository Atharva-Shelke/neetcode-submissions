class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> op = new HashMap<>();
        for(String str:strs){
            char[] toSort = str.toCharArray();
            Arrays.sort(toSort);
            String sorted = new String(toSort);
            op.putIfAbsent(sorted,new ArrayList<>());
            op.get(sorted).add(str);
        }


        return new ArrayList<>(op.values());
    }
}
