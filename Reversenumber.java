package arrays;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//6. reverse 6 digit number
		int n=123456, rev=0;
		while(n!=0)
		{
			int remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		System.out.println("the reverese of 123456 is:" +rev);
		
		
		
	}

}
