package mathematical;

public class MinMaxFromArray {
	
	public static void main(String[] args) {
		
		int arr[] = {34,32,904,56,4,4,4,23,67,400,34,9,5,102,231,21,4,67,23,400,28,4,4,4,344,251,344,405};
		int temp;
		int length = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
		       if(arr[i]>arr[j])
		       {
		    	   temp=arr[i];
		    	   arr[i]=arr[j];
		    	   arr[j]=temp;
		    	   
		       }
				
			}
		}
		
          
		 System.out.println("Smallest No : " + arr[0]);
		 System.out.println("2nd Smallest No : " + arr[4]);
		 
		 System.out.println("Largest No : " + arr[length-1]);
		 
		 // Find the 2nd Smallest number
		 int target=2;
		 int count=0;
		 int i=0;
		 int ThirdSmallest=arr[0];
		 
		 
		 while(count!=target) {
			 
			 if(arr[i]<arr[i+1]) {
				 
				 count++;
				 ThirdSmallest = arr[i];
				 
			 }
			 
			 i++;
			 
		 }
		 
		 System.out.println("3rd Smallest No : " + ThirdSmallest);
		
		 // 2nd Largest Number 
			 
			 
		 for(i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]<arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
				 
			 }
			 
		 }
		 
		 target=2;
		 count=0;
		 i=0;
		 int ThirdLargest=arr[0];
		 
		 while(count!=target) {
			 
			 if(arr[i]>arr[i+1]) {
			  
				 count++;
				 ThirdLargest= arr[i+1];
				 
			 }
			 
			 i++;
			 
		 }
		 
		 System.out.println("3rd Largest No : " + ThirdLargest);
		 
		 }		 
		 
        
	}
		 
		
		


	
	
	
	

