package mathematical;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static void main(String arg[]) {
		
		int arr[] = {32,41,21,34,21,78,45,32,45,27,26,89,33,45,20,90,99,103,75,61,62,81,82};  // 21,21,32,34,41
		int target =97;
		boolean flag=false;
		Arrays.sort(arr);
		int i=0;
		
		int left=0;
		int right=arr.length-1;
		int mid = (left+right)/2;
		
		System.out.println(left + " " + mid + " " + right);
		
		
		while(left<=right) {
			
			if(arr[mid] == target) {
				
				flag = true;
				System.out.println("element is present" + flag);
				break;
				
			}
			else {
				
				if(target<arr[mid])
				{
					right = mid-1;
					mid = (left + right) / 2; 
				}
				else
				{
					left = mid+1;
					mid = (left + right) / 2;
				}
				
								
			}
			
			System.out.println("End of Loop " + "First : " + left + " Mid : "+ mid+ " Last : " + right);
			
			
		}
		
		System.out.println("Value of Flag " + flag );
		
	}
	

}
