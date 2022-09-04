package week1.day1;

import java.nio.file.ReadOnlyFileSystemException;

public class IsPrime {

	public static void main(String[] args) {
		int n=7, c=0;
		int m=n/2;
		if (m==0||m==1)
		{
			System.out.println("The given no " + n + " is not an Prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
			if(n%i==0)
			{
				System.out.println("The given no "+n+ " is not an prime number");
				c=1;
				break;
			}
			}
			if(c==0)
			{
			System.out.println("The given no "+n+" is Prime number");
			}
		}

	}

}
