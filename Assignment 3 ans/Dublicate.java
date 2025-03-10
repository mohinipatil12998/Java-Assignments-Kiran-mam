class Dublicate
{
	public static void main(String args[]){
		
		int arr [] = {1,6,4,4,9,1,9};
		int length = arr.length;
		
		    for(int i = 0 ; i < arr.length ; i++){
			
		       for(int j = i + 1 ; j < arr.length; i++){	
			
		            if(arr [j] == arr [i] ){ 
		        
				    System.out.println("Dublicate Element Found  " + arr[i]);

		    }	
		        }
	                }	

	}
}

		