package logical_Programs;

import java.util.Scanner;

public class Even_Odd
{

	
	public static void main(String[] args)
	{
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter value =");
		int value = scan.nextInt();
		
		//if value is divided by 2 then the value is even   value%2 ==>0
		
		if(value%2==0)
		{
			System.out.println("it is even number ="+value);
		}
		else
		{
			System.out.println("it is odd number="+value);
		}
		
		
		
		
	}
	
}
