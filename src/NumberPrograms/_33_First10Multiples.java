package NumberPrograms;

import java.util.Scanner;

//5 Multiples = 5 10 15 20 25 30 35 40 45 50

public class _33_First10Multiples {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+num+"="+i*num);//easy(i*num)
		}
	}

}
