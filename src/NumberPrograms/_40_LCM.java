package NumberPrograms;

import java.util.Scanner;

public class _40_LCM {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number 1 : ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int n2=sc.nextInt();
		
		//To Find GCD/HCF
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2 ;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		
		//To Find LCM
		int hcf=(n1*n2)/gcd;
		
		System.out.println("HCF is :"+hcf);
	}

}
