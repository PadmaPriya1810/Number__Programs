package NumberPrograms;

import java.util.Scanner;

public class _07_LastDigit {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		int last=num%10;
		System.out.println("Last digit is "+last);
}
}