package designpatterns;

public class EquilateralTriangle {
	
	public static void main(String arg[]) {
		
		 int height = 5; // Height of the triangle

	        for (int i = 0; i < height; i++) {
	            // Print leading spaces
	            for (int j = height - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            // Print asterisks: Each line has 2*i + 1 asterisks
	            for (int k = 0; k < 2 * i +1; k++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	}

}
