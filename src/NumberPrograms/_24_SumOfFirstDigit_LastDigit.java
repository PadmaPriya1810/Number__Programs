package NumberPrograms;

import java.util.Scanner;

public class _24_SumOfFirstDigit_LastDigit{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int last=num%10;//Remember
		do
		{
			int last1=num%10;//Remember
			num=num/10;
		}
		while(num>10);
		
		
		int sum=last+num;
		System.out.println("Sum Of First & Last Digits "+sum);
		
		
}
}