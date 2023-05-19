package NumberPrograms;

import java.util.Scanner;

public class _28_PrimeNumber {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)//MR //Don't use 0. Start int i=1;i<=num
		{
			if(num%i==0) //if i=0 --> 0%0=infinity 
						//CTS //RTE(ArithmeticException)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Num");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
	}
}
