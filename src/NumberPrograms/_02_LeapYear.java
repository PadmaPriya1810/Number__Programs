package NumberPrograms;

import java.util.Scanner;

public class _02_LeapYear 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter any Year");
		int year=sc.nextInt();
		if(year%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}
