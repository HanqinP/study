package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestString {

	public int lengthOfLongestSubstring(String s) {
	        
		 int maxLength = 0;
		 int left = 0;
	     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	     
	     for(int i = 0;i<s.length();i++) {
	    	 if(map.containsKey(s.charAt(i))) {
	    		left = Math.max(left, map.get(s.charAt(i))+1); 
	    	 }
	    	 map.put(s.charAt(i), i);
	    	 maxLength = Math.max(maxLength, i-left+1);
	    	 
	     }
	    

		 return maxLength;
	       

	    }

}
