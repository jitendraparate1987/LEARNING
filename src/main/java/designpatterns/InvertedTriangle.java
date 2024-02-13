package designpatterns;

public class InvertedTriangle {
	
	
	public static void main(String arg[]) {
	
	int height = 5; // Height of the triangle

    for (int i = height; i > 0; i--) {
        // Print leading spaces
        for (int j = height - i; j > 0; j--) {
            System.out.print(" ");
        }
        // Print asterisks: Each line has 2*i - 1 asterisks
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();
    	}
    
    }

}
