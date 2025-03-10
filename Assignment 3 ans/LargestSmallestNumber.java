class LargestSmallestNumber {
	public static void main(String args[]){
		int arr [] = {1,3,5,9,7,2,12};
		 
		int largestNumber = arr[0];
		int smallestNumber =  arr[0];
		
		for(int i = 1 ; i < arr.length ; i++){

            // LargestNumber			
			if (arr[i] > largestNumber ){
			   largestNumber = arr[i];
			}
			
			//  SmallestNumber
			if(arr[i] < smallestNumber){
			   smallestNumber = arr[i];
			}
		}

		System.out.println("Smallest Number is " + smallestNumber);
		System.out.println("Largest Number is "+ largestNumber);	
    }
}
			
		
		