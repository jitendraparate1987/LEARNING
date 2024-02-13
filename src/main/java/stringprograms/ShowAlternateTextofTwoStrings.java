package stringprograms;

import java.util.ArrayList;
import java.util.List;

public class ShowAlternateTextofTwoStrings
{
  public static void main(String arg[]) {
	  
	  	  
	  // 2 string and its comparision
	  
	  String k1 = "abcdef";
	  String k2 = "pqrs";
	  StringBuffer sb = new StringBuffer();
	  
	  //apbqcrdsef
	  
	  int maxlength = Math.max(k1.length(), k2.length());
	  
	  for(int i=0;i<maxlength;i++) {
		  
		  if(i<k1.length()) {
			  
			  sb.append(k1.charAt(i));		  
			  }
		  
		  if(i<k2.length())
		  {
			  sb.append(k2.charAt(i));
		  }
		  
	  }
	  
	  
	  System.out.println(sb.toString());
	  
	  
  }	
}