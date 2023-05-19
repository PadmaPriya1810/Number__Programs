package NumberPrograms;

//Start=1 End=4
//Sum = 1+2+3+4
//    = 10
import java.util.Scanner;

public class _18_SumOfNumInRange 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Start Range");
		int start=sc.nextInt();
		
		System.out.println("Enter the End Range");
		int end=sc.nextInt();
		
		System.out.println("Sum of Numbers In Given Range");
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum=sum+i;	
		}
		System.out.println(sum);
	}

}
