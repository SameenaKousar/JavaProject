package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		//1. print all elements of an arrays
		String[] flowers= {"Rose","Jasmine","Lilly","Lotus","Sunflower","Daisy"};
		for(String i:flowers)
		{
			System.out.println(i);
		}
		
		//2. Elements of an array in reverse order
		System.out.println("Elements of an array in reverse order");
		for(int i=5;i>=0;i--)
		{
			System.out.println(flowers[i]);
		}
		//3.Duplicate elements of an array
       int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3, 4};
       System.out.println("Duplicate values in an array");
       
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]==arr[j]){
    			   System.out.println(arr[j]);
    		   }    		   
    	   }   	   
       }
       
       
    
        
	
		
		
		
	}

}
