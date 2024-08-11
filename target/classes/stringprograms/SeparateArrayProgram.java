package Mathematical;

import java.util.ArrayList;
import java.util.List;

public class SeparateArrayProgram{
	
	
	public void separateArray() {
		
		String [] s = {"A","b", "@","9", "d", "4", "#"};
		List<String> CharArray = new ArrayList<String>();
		List<String> NumArray = new ArrayList<String>();
		List<String> SpecialCharArray = new ArrayList<String>();
		
		for(String k : s) {
			
			if(k.matches("[^A-Za-z0-9]")) {
				SpecialCharArray.add(k);
			} else if(k.matches("[A-Za-z]")) {
				CharArray.add(k);
			}else if(k.matches("[0-9]")) {
				NumArray.add(k);
			}
			
		}
		
		String [] NumArray1 = NumArray.toArray(new String[0]);
		String [] SpecialCharArray1 = SpecialCharArray.toArray(new String[0]);
		String [] CharArray1 = CharArray.toArray(new String[0]);
		
		System.out.println(NumArray);
		
		
		
		
	}
	
	public void replacePattern() {
		
		String s1 = "I ate 10 apples";
		
		System.out.println(s1.replaceAll("[0-9]", ""));
		
		
	}
	
	
	public static void main(String[] args) {
		
	SeparateArrayProgram t4 = new SeparateArrayProgram();

     t4.replacePattern();

	}
}