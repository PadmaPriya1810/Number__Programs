package NumberPrograms;

import java.util.Scanner;

public class _29_PrimeNumberInRangeUsingMethodCall
{
	static Scanner sc=new Scanner(System.in);
	
	public static void isPrime(int num)//Passing 'i' Value
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Start Range");
		int start=sc.nextInt();
		System.out.println("Enter the End Range");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			isPrime(i);//Method Call
		}
	}
}
