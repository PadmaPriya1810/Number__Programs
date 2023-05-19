package NumberPrograms;

import java.util.Scanner;

public class _42_PowerOfNumber_while_Loop 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		System.out.println("Enter the Power");
		int pow=sc.nextInt();
		
		int answer=1;
		while(pow>0)
		{
			answer=answer*num;
			--pow;
		}
		System.out.println("Answer is : "+answer);
	}

}
