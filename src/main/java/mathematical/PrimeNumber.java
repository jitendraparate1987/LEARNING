package mathematical;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int num=101;
		boolean flag=false;
		
		for(int i=2;i<num;i++) {
			
			if(num % i == 0) {
				
				System.out.println("Remainder : " + (num % i) );
				flag=true;
				break;
			}
			else
			{
				flag=false;
				System.out.println("Remainder : " + (num % i) );
			}
			
		}
		
		if(flag==true) {
			System.out.println("Not a prime number");
			
		}else {
			System.out.println("Prime number");
		}
		
		
	}
	
}
