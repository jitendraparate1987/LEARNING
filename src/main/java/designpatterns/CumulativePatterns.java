package Patterns;

public class CumulativePatterns {
	
	public void fourtyFiveDegreeTriangle(int n)
	{
		for(int i = 1;i<=n;i++) {
			
			
			for(int k=i;k<=n-1;k++) {
				
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
	public void decreasingTriangle(int n) {
		
		int num=0;
		
		for(int i=n;i>0;i--) {
			
			 num = i;
			 
			for(int j=1;j<=i;j++) {
				
				System.out.print(num + " ");
				num--;
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
	public void ninetyDegreeTriangle(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");				
				
			}
			System.out.println();
		}
		
		
	}
	
	public void equilateralTriangle(int n)
	{
		for(int i=0;i<n;i++) {
			
			for(int k=i;k<n-1;k++) {
				
				System.out.print(" ");
			}
			
			
			for(int j=0;j < (2*i)+1;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}
	
	public void invertedEquilateralTriangle(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k = (2 * n)-i+1;k>i;k--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	void patternXPattern(int n) {
		
		for(int i=0;i<n;i++) {
			
			for( int j=0;j<n;j++) {
				
			if((i==j) || ((i+j) == 4)) {
				
				System.out.print("*");
							
			} else {
				
				System.out.print(" ");
				
			}
			
			
			}
			
			System.out.println();
		}
				
	}
	
	
void hollowXPattern(int n) {
		
		for(int i=0;i<n;i++) {
			
			for( int j=0;j<n;j++) {
				
			if((i==j) || ((i+j) == 4) || i==0 || i==n-1) {
				
				System.out.print("*");
							
			} else {
				
				System.out.print(" ");
				
			}
			
			
			}
			
			System.out.println();
		}
				
	}
	
	
	public void hollowsquare(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(i==1 || j==1 || i==5 || j==5) {
					
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	public void numberNinetyDegree(int n) {
		
		// 1
		// 2 3
		// 3 4 5
		// 4 5 6 7
		// 5 6 7 8 9
		// 6 7 8 9 10 11
		
		int num;
		
		for (int i=1; i<=n;i++) {
			
			num=i;
			
			for (int j=1;j<=i;j++) {
				
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
	public void alphanumericOrNot() {
		
		String str1 = "abc123";
		String str2 = "abc@123";
		boolean isAlphanumeric1 = str1.matches("[a-zA-Z0-9]+");
		boolean isAlphanumeric2 = str2.matches("[a-zA-Z0-9]+");
		System.out.println("Is str1 alphanumeric? " + isAlphanumeric1); // true
		System.out.println("Is str2 alphanumeric? " + isAlphanumeric2); // false
		
	}
	
	public void removeSpecialCharacters()
	{
		 String s = "        He!!o H0w are Y@u       ";
		 
		 String s1 = s.replaceAll("[^A-Za-z0-9]", "");
		 
		 System.out.println(s1);
		 System.out.println(s);
		 System.out.println(s.strip());
		 System.out.println(s.stripTrailing());
		 
		 
		 
	}
	
	
	
	public static void main(String[] args) {
		
		
		CumulativePatterns p = new CumulativePatterns();
		p.decreasingTriangle(5);
		
	}

}
