package NumberPrograms;

import java.util.Scanner;

public class _15_NumInRange
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Start Range");
		int start=sc.nextInt();
		
		System.out.println("Enter the End Range");
		int end=sc.nextInt();
		
		System.out.println("Numbers is Range:");
		for(int i=start;i<=end;i++)
		{
			System.out.print(i+" ");
		}
	}

}
