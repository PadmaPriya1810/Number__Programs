package NumberPrograms;

import java.util.Scanner;

public class _05_SwapUsing3rdVar {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
	    int c=0;
	    System.out.println("Before Swapping: "+a+" "+b);
	    c=a;
	    a=b;
	    b=c;
	    System.out.println("After Swapping: "+a+" "+b);
}
}