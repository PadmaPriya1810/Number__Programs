package NumberPrograms;

import java.util.Scanner;

public class _45_Armstrong_EASY
{
static Scanner sc=new Scanner(System.in);

   public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int temp=num;
		
		int pow=count(num);//Making Count as Power
		
		//Remember
		
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			sum=sum+power(last,pow);//Focus
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not A Armstrong Number");
		}
	}
   
   //To Count The Number Of Digits
   public static int count(int num)
   {
	   int count=0;
	   while(num>0)
	   {
		   num=num/10;
		   count++;
	   }
	   return count;
   }
   
   //To Calculate Power
   public static int power(int num,int pow)
   {
	   if(pow==0)
		   return num;
	   else
	   {
		   int answer=1;
		   for(int i=1;i<=pow;i++)
		   {
			   answer=answer*num;
		   }
		   return answer;
	   }
   }
   
   
}
