package designpatterns;

public class FourtyfiveDegreeTriangle {
	
	public static void main(String arg[]){
		
		int height=5;
		
		// Loop with i variable is to iterate for each new row
		for(int i=0;i<height;i++) {
			
			// Loop with j variable is to add the space until j not equals to i in reverse order
			for(int j=height-1;j>=i;j--) {
			System.out.print(" ");
			}
			
			// Loop with k variable is to print the "*" on screen 
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			
			
			// This statement is to send the cursor to next line
			System.out.println();
			
		}
		
	}

}
