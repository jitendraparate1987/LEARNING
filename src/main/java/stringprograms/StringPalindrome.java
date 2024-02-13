package stringprograms;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String s1="malam";
		int length = s1.length();
		boolean flag = false;
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i) == s1.charAt(length-1))
			{   
				System.out.println("yes");
				flag = true;
			}else {
				
				flag = false;
				break;
				
			}
			
			if(length>0) {
				length--;	
			}
			
			
			
		}
		
		if(flag==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
