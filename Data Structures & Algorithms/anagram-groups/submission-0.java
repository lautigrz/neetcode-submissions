class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>, List<String>> map = new HashMap<>();
    
        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            HashMap<Character,Integer> key = new HashMap<>();

            for(int j = 0; j < word.length(); j++){

                if(key.containsKey(word.charAt(j))){
                    int newValor = key.get(word.charAt(j)) + 1;

                    key.put(word.charAt(j), newValor);
                }else{
                    key.put(word.charAt(j), 1);
                }

            }

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(word);
                map.put(key, list);
            }else{
                map.put(key, new ArrayList<>(List.of(word)));
            }

        }    

        List<List<String>> anagrams = new ArrayList<>();

        for(Map.Entry<HashMap<Character,Integer>, List<String>> entry : map.entrySet()){

            anagrams.add(entry.getValue());

        }

    return anagrams;
    }
}
