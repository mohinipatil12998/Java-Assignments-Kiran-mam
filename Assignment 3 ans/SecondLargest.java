class SecondLargest
{
	public static void main(String args[]){
		
		int [] arr = new int[]{1,7,2,8,1,5};
		
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

		System.out.println(" secondlargest largest no is " + secondLargest );
	}
	
	
}

