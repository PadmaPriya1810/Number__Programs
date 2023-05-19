package NumberPrograms;

import java.util.Scanner;

public class _06_SwapWO3rdVar {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
	  
	    System.out.println("Before Swapping: "+a+" "+b);
	   a=a+b;
	   b=a-b;
	   a=a-b;
	    System.out.println("After Swapping: "+a+" "+b);
}
}
