package NumberPrograms;

import java.util.Scanner;

public class _31_SumOfPrimeNoInRange 
{
static Scanner sc=new Scanner(System.in);
	
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		   return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Start Range ");
		int start=sc.nextInt();
		
		System.out.println("Enter End Range");
		int end=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=end;i++) //Loop for Start-End Range
		{
			if(isPrime(i)) //true/false
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);//Sum of Prime Numbers in Range
	}	
}
