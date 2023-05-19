package NumberPrograms;

import java.util.Scanner;

public class _34_ReverseTheNumber_Easy 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		System.out.print("Reverse of the Number is: ");
		while(num!=0)//If we don't know the Number of Iterations
		{
			int last=num%10;
			System.out.print(last);
			num=num/10;
		}
}
}