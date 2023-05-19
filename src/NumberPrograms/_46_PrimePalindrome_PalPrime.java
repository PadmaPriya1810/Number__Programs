package NumberPrograms;

import java.util.Scanner;

/* PalPrime or PrimePalindrome - Both Prime & Palindrome
 * 313, 353
 */
public class _46_PrimePalindrome_PalPrime
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		if(isPrime(num)&&isPalindrome(num)) //Should Satisfy Prime & Palindrome
		{
			System.out.println("PrimePalindrome / PalPrime");
		}
		else
			System.out.println("Not A PrimePalindrome / PalPrime");
	}
	
   public static boolean isPrime(int num)
   {
	   int count=0;
	   for(int i=1;i<=num;i++)
	   {
		   if(num%i==0)
		   {
			   count++;
		   }
	   }
	   if(count==2)
	   {
		   return true;
	   }
	   else
		   return false;
   }
   
   public static boolean isPalindrome(int num)//To Reverse & Check Palindrome or Not
   {
	   int rev=0;int temp=num;
	   while(num>0)
	   {
		   int last=num%10;
		   rev=rev*10+last;
		   num=num/10;   
	   }
	   
	   if(temp==rev)
	   {
		   return true;
	   }
	   else
		   return false;
   }
}
