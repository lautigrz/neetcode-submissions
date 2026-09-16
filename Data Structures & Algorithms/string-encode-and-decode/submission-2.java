class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
    	
    	for(String st : strs) {
    		
    		int longitud = st.length();
    		
    		encode.append(longitud);
    		encode.append("-");
    		encode.append(st);
    	}
    	
    	return String.valueOf(encode);
    }

    public List<String> decode(String str) {
      
    	List<String> decode = new ArrayList<>();
    	char delimitador = 45;
    	
    	for(int i = 0; i < str.length(); i++) {
    		
    		StringBuilder stb = new StringBuilder();
    		
    		char[] arr = str.toCharArray();
    		
    		while(arr[i] != delimitador) {
    			
    			stb.append(arr[i]);
    			i++;
    		}
    		
    		i++;
    		
    		int longitud = Integer.parseInt(String.valueOf(stb));
    		
    		stb = new StringBuilder();
    		
    		int count = 0;
    		while(count < longitud) {
    			
    			stb.append(arr[i]);
    			count++;
    			i++;
    		}
    		
    		decode.add(String.valueOf(stb));
    		
    		i--;
    		
    	}
    	
    		
    	return decode;
    }
}
