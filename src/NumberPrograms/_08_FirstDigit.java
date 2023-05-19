package NumberPrograms;

import java.util.Scanner;

public class _08_FirstDigit {
	static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter a Number");
			
			int num=sc.nextInt();
			while(num>=10) //MR
			{
			num=num/10;
			}
			System.out.println(num);
}

}