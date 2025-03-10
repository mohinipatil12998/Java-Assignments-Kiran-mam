class SumAverage{
	public static void main(String[] args){
	int arr [] = {3,5,6,1,9,7};
	int sum = 0;
	int avg = 0;
	
	
	for(int k = 0; k<arr.length; k++){
	 sum = sum + arr[k];
	}
	
	avg = sum / arr.length;
		System.out.println("Sum Of Number " + sum);
	System.out.println("Avg Of Number " + avg);
		
	}
	

	
}
