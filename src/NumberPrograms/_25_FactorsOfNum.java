package NumberPrograms;

//Factors of 10 = 1,2,5 and 10
//Given Original num/num==0 --->Num(Factors)

import java.util.Scanner;

public class _25_FactorsOfNum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		System.out.println("Factors are ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
