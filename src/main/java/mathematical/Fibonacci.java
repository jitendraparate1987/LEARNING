package mathematical;

public class Fibonacci {
	
	
	public static void main(String arg[]) {
		
		int maxlength = 8;
		int a=0;
		int b=1;
		int temp;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=0;i<maxlength-2;i++) {
			
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp + " ");	
			
		}
		
		
		
	}

}
