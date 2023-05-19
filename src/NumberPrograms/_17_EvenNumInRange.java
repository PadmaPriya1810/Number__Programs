package NumberPrograms;

import java.util.Scanner;

public class _17_EvenNumInRange {
static Scanner sc=new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter the Start Range");
	int start=sc.nextInt();
	
	System.out.println("Enter the End Range");
	int end=sc.nextInt();
	
	System.out.println("Even Numbers in Given Range");
	for(int i=start;i<=end;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
	}
}
}
