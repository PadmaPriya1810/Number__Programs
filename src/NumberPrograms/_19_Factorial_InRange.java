package NumberPrograms;

import java.util.Scanner;

public class _19_Factorial_InRange 
{
static Scanner sc=new Scanner(System.in);

public static void main(String[] args) 
{
	System.out.println("Enter Start Range");
	int start=sc.nextInt();
	
	System.out.println("Enter End Range");
	int end=sc.nextInt();
	
	for(int i=start;i<=end;i++)
	{
		factorial(i);
	}
}

public static void factorial(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
   System.out.println(fact);
}
}
