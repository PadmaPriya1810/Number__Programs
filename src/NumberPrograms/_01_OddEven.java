package NumberPrograms;

import java.util.Scanner;

public class _01_OddEven 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		
		if(a%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
	}

}
