package mathematical;

public class SwapTwoValues {
	
	public static void main(String[] args) {
		
		int a=23;
		int b = 35;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
		
		
	}

}
