package mathematical;

public class GetMaxByMultiplyByEachOther {
	
	public static void main(String arg[]) {
		
		int num[] = {2,3,5,7,9,13,11,24,15};
		int temp, max=0;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++) {
				
				temp = num[i] * num[j];
				
				if(max<=temp) {
					
					max=temp;
					
				}
				
				
			}
		}
		
		System.out.println("Max Value for multiplication is : " + max);
		
	}

}
