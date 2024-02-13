package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String InputString = "Life is full of surprises and sometimes those surprises come in the form of unexpected unexpected events.";
		Set<String> set = new LinkedHashSet<String>();
		StringBuffer sb = new StringBuffer();
		
		 for(int i=0;i<InputString.length();i++) {
			 
			 if(InputString.charAt(i) == ' ') {
				 
				 set.add(sb.toString());
				 sb.setLength(0);
				 				 
			 }else {
				 
				 sb.append(InputString.charAt(i));
			 }
			 
			 
		 }
		 
		 if(sb.length()>0) {
			 
			 set.add(sb.toString());
			 sb.setLength(0);
			 
		 }
		 
		 for(String s : set) {
			 
			 sb.append(s);
			 sb.append(" ");
			 
		 }
		 
		 System.out.println(sb.toString());
		 
	
	}
	
	
}
