package NumberPrograms;

import java.util.Scanner;

public class _35_ReverseTheNumber_Logic //EASY
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int last=0,rev=0;
		
		while(num>0)
		{
			last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		System.out.println("Reverse Number is "+rev);
	}

}
