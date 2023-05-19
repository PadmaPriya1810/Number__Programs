package NumberPrograms;

import java.util.Scanner;
//COMPOSITE NUMBER - More Than 2 Factors

//Prime num ==2 Factors 
//Composite num >2 Fcators

public class _32_CompositeNumber {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			count++;
		}
		if(count>2)
		{
			System.out.println("Composite Number");
		}
		else
			System.out.println("Not a Composite Number");
	}

}
