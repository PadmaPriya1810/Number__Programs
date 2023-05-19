package NumberPrograms;

import java.util.Scanner;

public class _16_ReverseNumbersInRange {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter Start Range ");
		int start=sc.nextInt();
		
		System.out.println("Enter End Range ");
		int end=sc.nextInt();
		
		System.out.println("REVERSE ORDER");
		for(int i=end;i>=start;i--)
		{
			System.out.println(i);
		}
	}

}
