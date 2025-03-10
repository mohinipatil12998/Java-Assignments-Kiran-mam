/*Count Even and Odd Numbers
○ Count the number of even and odd numbers in an array*/

class EvenOdd
	{
			public static void main(String[] args){
			int arr [] ={4,1,9,3,5,8,2};
			int evencount = 0;
			int oddcount = 0;
			
			
			for(int i = 0; i < arr.length ; i++){
				
				if(arr[i] % 2 == 0 ) {
				evencount++;
				}
				else{
					oddcount++;
				}
			}		
			System.out.println("The Number is Even " + evencount);
			System.out.println("The Number is Odd " + oddcount);
			
			}
	}
	