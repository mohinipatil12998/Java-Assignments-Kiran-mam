class SmallestLargestNum{
		public static void main(String args[]){
		int [] arr = {2,8,4,7,1};
		int small = arr[0]; 
		
		for (int i = 1; i < arr.length; i++)
		{
		if (arr[i] < smallest)
		{
		smallest = arr[i];
		}
		}
		System.out.println("The smallest number in the array: " + smallest);
		}
		}
		
		
		
		
		
		 
		
		}
}