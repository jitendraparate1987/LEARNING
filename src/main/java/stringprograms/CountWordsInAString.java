package stringprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordsInAString {

    public static void main(String[] args) {

    	String k = "Life is full of surprises and sometimes those surprises come in the form of unexpected & unexpected events";
		k = k.toLowerCase();
		StringBuffer sb11 = new StringBuffer();
		List<String> str = new ArrayList<String>();
		
		// Get the list of words from the String
		
		for(int i=0;i<k.length();i++) {
			
			if(k.charAt(i) == ' ')
			{
				str.add(sb11.toString());
				sb11.setLength(0);
			}
			else {
				
				sb11.append(k.charAt(i));
				
			}
			
		}
		
		if(sb11.length()>0) {
			
			str.add(sb11.toString());
			
		}
		
		System.out.println(str);
		
		// Get the count of each word and its occurrence
		
		Map<String,Integer> count = new HashMap<String,Integer>();
		int temp;
		
		for(int i=0; i<str.size();i++) {
			
			if(count.containsKey(str.get(i))) {
				
				temp = count.get(str.get(i));				
				temp++;
				count.put(str.get(i),temp);
				
				
			}else {
				
				count.put(str.get(i), 1);
				
			}
			
		}
		
		System.out.println(count);
		
		
    }
}
