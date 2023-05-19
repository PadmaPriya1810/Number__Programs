package NumberPrograms;

//Factors of 10 = 1,2,5 and 10
//Number Of Factors=4

import java.util.Scanner;

public class _26_NumOfFactors {
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	int count=0;
	
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	
	System.out.println(" Number Of Factors: " +count);
}
}