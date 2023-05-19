package NumberPrograms;

import java.util.Scanner;

/*Perfect Number - 6
 * Positive Number is equal to the sum of its proper divisors
 
					Factors of 6 = 1,2,3,6 (But Omit 6)
					
					sum of Factors=1+2+3 = 6			
*/
public class _38_PerfectNumber 
{
	static Scanner sc=new Scanner(System.in);
	
	public static int sumOfFactors(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)//Important Remember: Should not Take till Number
		{
			if(num%i==0)
			{
				sum=sum+i; //Sum Of Factors
			}
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int temp=num;
		
		if(temp==sumOfFactors(num))
		{
			System.out.println("Perfect");	
		}
		else
			System.out.println("Not Perfect");	
	}
}
