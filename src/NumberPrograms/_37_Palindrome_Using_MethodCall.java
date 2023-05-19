package NumberPrograms;
//Both Reverse the Number & Palindrome in Same Program Using Method Call
public class _37_Palindrome_Using_MethodCall 
{
	//Reverse Number Logic
	public static int reverseNumber(int num)
	{
		int last=0,rev=0;
		while(num>0)
		{
			last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		return rev;
	}

	public static void main(String[] args)
	 {
	int num=121;
	int revnum=reverseNumber(num);//reverseNumber() Method Call
	
		if(num==revnum)
		{
			System.out.println("Palindrome");
		}
			else
			System.out.println("Not a Palindrome");
	 }
}
