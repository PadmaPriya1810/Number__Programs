package NumberPrograms;

import java.util.Scanner;

public class _20_EvenDigitsInNum {
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		System.out.println("Even Digits are: ");
		do
		{
			int last=num%10;
			if(last %2==0)
			{
				System.out.print(last+" ");
			}
			num=num/10;
		}
		while(num>0);	
	}
}
