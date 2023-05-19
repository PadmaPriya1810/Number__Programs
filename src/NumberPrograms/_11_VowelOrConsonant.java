package NumberPrograms;

import java.util.Scanner;

public class _11_VowelOrConsonant 
{
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
	System.out.println("Enter a Alphabet");
	char ch=sc.next().charAt(0);
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println("It's a Vowel!");
	}
	else
	{
		System.out.println("It's a Consonant!");
	}
}
	

}
