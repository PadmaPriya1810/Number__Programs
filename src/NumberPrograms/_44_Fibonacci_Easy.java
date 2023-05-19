package NumberPrograms;

import java.util.Scanner;

public class _44_Fibonacci_Easy
{
 static Scanner sc=new Scanner(System.in);
 
 public static void main(String[] args) 
 {
	System.out.println("Enter the Terms");
	int terms=sc.nextInt();
	
	int f=0,s=1;
	for(int i=1;i<=terms;i++)
	{
		System.out.print(f+" "); //0 1 1 2 3 5 8 13 
		int t=f+s;
		f=s;
		s=t;
	}
 }
}

