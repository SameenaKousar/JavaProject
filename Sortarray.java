package arrays;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //4.Sort the array
	       int [] array= {20,32,42,12,13,9,7,4,23,50,76};
	       System.out.println("Elements of array sorted in ascending order:");
	       for(int i=0;i<array.length;i++)
	       {
	    	   for(int j=i+1;j<array.length;j++) {
	    		   int temp=0;
	    		   if(array[i]>array[j]) {
	    			   temp=array[i];
	    			   array[i]=array[j];
	    			   array[j]=temp;
	    		   }
	    	   }
	    	   System.out.println(array[i]);
	       }

	}

}
