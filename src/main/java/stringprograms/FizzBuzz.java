//The FizzBuzz problem is a classic programming task, often used in software development interviews to assess basic programming skills. 
//The task is simple: write a program that prints the numbers from 1 to 100, but for multiples of 3 print "Fizz" instead of the number, 
//and for the multiples of 5 print "Buzz". For numbers which are multiples of both three and five, print "FizzBuzz".

package stringprograms;

public class FizzBuzz {
	
	public static void main(String[] args) {
		

		int num=100;
		
		for(int i=1;i<=num;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3 == 0) {
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
			
		}
		
		
		
	}

}
