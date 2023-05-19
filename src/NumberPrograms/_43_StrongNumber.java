package NumberPrograms;

import java.util.Scanner;

public class _43_StrongNumber 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int temp=num;
		
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			sum=sum+factorial(last);//Remember
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}
		else
			System.out.println("Not A Strong Number");
		
	}
	
	public static int factorial(int num)
	{
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
