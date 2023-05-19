package NumberPrograms;

/*		Math is a Class. It is an Inbuilt pow() to find the power
		Math.pow(2,5)
		Output:32.0
		return type of pow() is double 

*/
import java.util.Scanner;

public class _41_Power_Using_for_Loop_EASY {
static Scanner sc=new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	
	System.out.println("Enter the Power");
	int pow=sc.nextInt();
	
	if(pow==0)
	{
		System.out.println(num);
	}
	else
	{
		int answer=1;
		for(int i=1;i<=pow;i++)
		{
			answer=answer*num;
		}
		System.out.println("Answer is :"+ answer);
    }
}
}
