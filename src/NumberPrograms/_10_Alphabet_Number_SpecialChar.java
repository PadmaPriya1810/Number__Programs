package NumberPrograms;

import java.util.Scanner;

public class _10_Alphabet_Number_SpecialChar {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Any Character");
		char ch=sc.next().charAt(0);
		String res=(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')?"It's an Alphabet!":(ch>='0'&&ch<='9')?"It's a Number":"It's a Special Character";
		System.out.println(res);

}
}