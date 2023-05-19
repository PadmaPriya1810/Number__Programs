package NumberPrograms;

import java.util.Scanner;
import java.util.Random; //Like "Scanner" class import "Random" class


public class _12_OTP_RandomNumber 
{
	static Scanner sc=new Scanner(System.in);
	static Random r=new Random();//Create Obj for "Random" class
	
	public static void main(String[] args) 
	{
	//int a=sc.nextInt(); //For Scanner
	int rand=r.nextInt(100);//Pass the Number Range you want
	
	System.out.println(rand);
	}
}
