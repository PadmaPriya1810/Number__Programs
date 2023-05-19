package NumberPrograms;

import java.util.Scanner;

public class _09_AlphabetOrNot 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter Any Character");
		char ch=sc.next().charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		{
			System.out.println("It's an Alphabet");		
		}
		else
			System.out.println("It's not an Alphabet");		
	}

}