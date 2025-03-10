public class MissingNum{
	
	public static void main(String[] args){
		
		int arr1[] = {2,1,4,5,0};
		
		System.out.println("Missing Number: " + missingNumber(arr1));
		
	}
					public static int missingNumber(int[] arr){
					int num1 = 0;
					int num2 = 0;
							for(int i=0; i<arr.length; i++){
							num1 = num1 ^ arr[i];
							}
								for(int i=0; i<=arr.length; i++){
								num2 = num2 ^ i;
								}
									return num2 ^ num2;
	}
}