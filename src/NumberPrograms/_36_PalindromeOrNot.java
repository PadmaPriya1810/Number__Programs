package NumberPrograms;

import java.util.Scanner;

public class _36_PalindromeOrNot
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int temp=num;
		int last,rev=0;
	
		while(num>0)
		{
			last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		
		if(temp==rev)
		{
			System.out.println("Palindrome");	
		}
		else
			System.out.println("Not a Palindrome");
   }
}