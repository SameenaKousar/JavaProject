package arrays;

public class Stringcount {

	public static void main(String[] args) {
		
		//7. Number of characters in a String
			String str="Hello welcome to my coding";
			int count=0;
			System.out.println("given string is:"+str);
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=' ') 
					count++;
				}
			System.out.println("Total number of characters in string is :"+count);
		


	}

}
