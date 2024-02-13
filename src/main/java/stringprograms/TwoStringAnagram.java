package stringprograms;

import java.util.Arrays;

public class TwoStringAnagram {
	
	public static void main(String[] args) {
		
		String s1 = "binary";
		String s2 = "brainy";
		
		
		if(s1.length() == s2.length()) {
			
			s1.toLowerCase();
			s2.toLowerCase();
			
			char[] s1_char = s1.toCharArray();
			char[] s2_char = s2.toCharArray();
			
			Arrays.sort(s1_char);
			Arrays.sort(s2_char);
			
			if(Arrays.equals(s1_char, s2_char)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not an anagram");
			}
			
			
			
			
		}else {
			
			System.out.println("Not an anagram");
			
		}
		
		
		
	}

}
