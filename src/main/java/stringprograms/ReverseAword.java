package stringprograms;

public class ReverseAword {
	
	public static void main(String[] args) {
		
		String s1 = "A new beginning";
		StringBuffer sb = new StringBuffer();
		
		for(int i = s1.length()-1;i>=0;i--) {
			
			sb.append(s1.charAt(i));
			
		}
		
		String ReverseString = sb.toString();
		
		System.out.println(ReverseString);
		
		
	}

}
