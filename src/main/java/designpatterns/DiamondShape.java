package designpatterns;

public class DiamondShape {
	
	public static void main(String arg[])
	{
		int size = 11;
		int upper = size/2+1;
		int lower = size/2;
		
		// Iteration for new line & this for Loop is for upper triangle
		for(int i=0;i<upper;i++) {
						
			for(int j=upper;j>i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
