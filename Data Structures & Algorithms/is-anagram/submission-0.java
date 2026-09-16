class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> hashMapS = new HashMap<>();
        HashMap<Character,Integer> hashMapT = new HashMap<>();

       for(int i = 0; i < s.length(); i ++){

            if(hashMapS.containsKey(s.charAt(i))){
                int num = hashMapS.get(s.charAt(i)) + 1;

                hashMapS.put(s.charAt(i), num);
            }else{
                hashMapS.put(s.charAt(i), 0);
            }

            if(hashMapT.containsKey(t.charAt(i))){
                int num = hashMapT.get(t.charAt(i)) + 1;

                hashMapT.put(t.charAt(i), num);
            }else{
                hashMapT.put(t.charAt(i), 0);
            }
       }

        return hashMapS.equals(hashMapT);


    }
}
