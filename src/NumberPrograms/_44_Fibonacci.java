package NumberPrograms;

import java.util.Scanner;

// FIBONACCI SERIES - 0 1 1 2 3 5 8 13 

public class _44_Fibonacci 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Terms");
		int terms=sc.nextInt();
		
		int FirstTerm=0,SecondTerm=1;
		
		if(terms==1)
		{
			System.out.print(FirstTerm+" ");
		}
		if(terms==2)
		{
			System.out.print(FirstTerm+" "+SecondTerm);
		}
		if(terms>2)
		{
			System.out.print(FirstTerm+" "+SecondTerm);
		
			for(int i=3;i<=terms;i++)
		     {
				int ThirdTerm=FirstTerm+SecondTerm;//Find Third Digit First
				System.out.print(" "+ThirdTerm);
				
				FirstTerm=SecondTerm;
				SecondTerm=ThirdTerm;
	         }
	}
	}
	

}
