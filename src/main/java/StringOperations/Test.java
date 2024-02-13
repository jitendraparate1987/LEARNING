package StringOperations;

import java.lang.reflect.Array;

public class Test {
	
	public static void main(String arg[]) {
		
		String s="hello";
		
		System.out.println(s.contains("el"));
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.append(0);
		System.out.println(sb.reverse());
		sb.length();
		
		
		
		
	}

}
