package NumberPrograms;

import java.util.Scanner;

public class _13_AlphabetsInRange {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Starting Alphabet");
		char start=sc.next().charAt(0);
		
		System.out.println("Enter the Ending Alphabet");
		char end=sc.next().charAt(0);
		
		for(char i=start;i<=end;i++)//char type
		{
			System.out.println(i);
		}
		
	}

}
