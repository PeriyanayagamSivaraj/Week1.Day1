package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Factorial of 5 mean 5! = 5*4*3*2*1
		 */
		
		int n=5; 
		int output=1;
		for (int i = 1; i<=n ;i++)
		{
			output=output*i;
			
		}
		System.out.println(output);

	}

}
