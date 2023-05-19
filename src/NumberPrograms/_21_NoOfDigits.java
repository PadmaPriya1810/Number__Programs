package NumberPrograms;

import java.util.Scanner;

public class _21_NoOfDigits {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int count=0;
		
		while(num>0)
		{
			num=num/10;//Splits each digit
			count++;
		}
		
		
		System.out.println("Number Of Digits : "+count);
	}

}
