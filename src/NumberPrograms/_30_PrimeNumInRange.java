package NumberPrograms;

//NestedForLoop Prime Number In Given Range

import java.util.Scanner;

public class _30_PrimeNumInRange {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Start Range");
		int start=sc.nextInt();
		System.out.println("Enter the End Range");
		int end=sc.nextInt();
		
		for(int Range=start;Range<=end;Range++)
		{
			int count=0;
			for(int i=1;i<=Range;i++)// Remember: i<=Range
			{
				if(Range%i==0)
				{
					count++;
				}
			}
			
				if(count==2)
				{
					System.out.println(Range);
			    }
		}
		
	}

}
