package NumberPrograms;

import java.util.Scanner;

public class _03_LargestOf3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		System.out.println("Enter C");
		int c=sc.nextInt();
		
	System.out.println(a>b&&a>c?"A is Largest":b>a&&b>c?"B is Largest":"C is Largest");//MR
	
	}

}
