package NumberPrograms;

import java.util.Scanner;

public class _39_GCD_HCF 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number 1 :");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		int n2=sc.nextInt();
		
		
		int gcd=1;//Assume Minimum GCD=1 //Coz any 2 numbers Commonly divided by 1
		
			for(int i=1;i<=n1&&i<=n2;i++) //Both the numbers should iterate till Least number
				{
					if(n1%i==0 && n2%i==0)//Both the conditions should satisfy
				
					gcd=i;
				}
				System.out.println("Num1 :"+n1);
				System.out.println("Num2 :"+n2);
				System.out.println("GCD is: "+gcd);
	}

}
