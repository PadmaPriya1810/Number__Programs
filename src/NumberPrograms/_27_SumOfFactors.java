package NumberPrograms;

//Factors of 10 = 1,2,5 and 10
//Sum Of Factors=1+2+5+10
//				=18
import java.util.Scanner;

public class _27_SumOfFactors {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
					
			{
				sum=sum+i;
					
			}
		}
		System.out.println("Sum of Factors :"+sum);
	}
}
