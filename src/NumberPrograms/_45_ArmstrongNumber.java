package NumberPrograms;
/*ARMSTRONG NUMBER - 153, 370, 371, 407
 
Definition: An Armstrong number is an integer such that the sum of the power of its digits is
equal to the number itself.

153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643
125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

 */

import java.util.Scanner;

public class _45_ArmstrongNumber 
{
static Scanner sc=new Scanner(System.in);

public static void main(String[] args) 
{
	System.out.println("Enter The Number");
	int num=sc.nextInt();
	int temp=num; //num=123
	
	int count=count(num); //Digits count=3
	
	int sum=0;
	while(num>0)
	{
		int last=num%10;
		sum=sum+pow(last,count);//pow(lastDigit,Digits_count)
		num=num/10;
	}
	if(sum==temp)
	{
		System.out.println("Armstrong Number");
	}
	else
		System.out.println("Not an Armstrong Number");
}

//To Find Number Of Digits
public static int count(int num)//(num)
{
	int count=0;
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	return count;
}

//To Find Power
public static int pow(int num, int power)//(LastDigit,Digitscount)
{
	if(power==0)
		return num;
	else
	{
		int answer=1;
		while(power>0)
		{
			answer=answer*num;
			power--;
		}
		return answer;
	}
}

}
