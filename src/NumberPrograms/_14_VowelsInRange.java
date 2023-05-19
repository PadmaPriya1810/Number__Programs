package NumberPrograms;

import java.util.Scanner;

public class _14_VowelsInRange {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Starting Alphabet");
		char start=sc.next().charAt(0);
		
		System.out.println("Enter the Ending Alphabet");
		char end=sc.next().charAt(0);
		
		System.out.println("Vowels in Given Range:");
		for(char i=start;i<=end;i++)//char type
		{
			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'||i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
			System.out.print(i+" ");
		}
		
	}

}