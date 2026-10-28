class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        // int[] alphabets = new int[26];

        // for(int i=0;i<s.length();i++){
        //     alphabets[(s.charAt(i))-'a']++;
        //     alphabets[(t.charAt(i))-'a']--;
        // }

        // for(int i:alphabets){
        //     if(i!=0){
        //         return false;
        //     }
        // }
        // return true;
        HashMap<Character,Integer> alphabets = new HashMap<>();
        for(int i=0;i<s.length();i++){
            alphabets.put(s.charAt(i),alphabets.getOrDefault(s.charAt(i),0)+1);
            alphabets.put(t.charAt(i),alphabets.getOrDefault(t.charAt(i),0)-1);
        }
        for(int i:alphabets.values()){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}
