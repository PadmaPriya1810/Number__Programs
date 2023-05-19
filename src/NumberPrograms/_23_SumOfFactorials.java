package NumberPrograms;


//Strong Number Logic & Check with temp=num
import java.util.Scanner;

//Num = 5  //Factorial	= 5*4*3*2*1
//						=120

//Sum Of Factorial	= 1! + 2! + 3! + 4! + 5! 
//					= 1 + 2 + 6 + 24 + 120 
//					= 153

public class _23_SumOfFactorials {
static Scanner sc=new Scanner(System.in);	

public static void main(String[] args) {
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	
	int fact=1;
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i; //To Get Factorial
		sum=sum+fact; //To Add factorial
	}
	
	System.out.println("Factorial is :"+fact);
	System.out.println("Sum Of Factorials is :"+sum);
}
}
