package NumberPrograms;

import java.util.Scanner;

public class _22_SumOfDigits 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{	
			int last=num%10;
			sum=sum+last;
			num=num/10;	
		}

		System.out.println("Sum Of Digits " +sum);
		
	}

}
