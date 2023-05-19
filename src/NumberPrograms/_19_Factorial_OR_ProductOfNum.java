package NumberPrograms;

import java.util.Scanner;

//Factorial Of 4= 4*3*2*1
//				= 24			

public class _19_Factorial_OR_ProductOfNum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		System.out.println("Factorial of Given Number is: ");
		int fact=1; //For Multiply & Division =1
		
		for(int i=1;i<=num;i++)//i=1 if i=0, while multiplying it becomes 0
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
