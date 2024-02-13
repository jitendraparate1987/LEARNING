package mathematical;

public class BubbleSort {
	
	public static void main(String arg[])
	{
		
		int arr[] = {45,21,46,22,78,24,67,21,56};
		int temp;
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
					
				}
				
			}
			
		}
		
		for(int i=0; i<arr.length;i++) {
			
		System.out.println(arr[i]);
			
		}
		
	}

}
