package logical_Programs;

import java.util.Scanner;

public class Pallindrome_String

{

	public static void main(String[] args)
	{
	
		
		
		String act="";
		String exp="";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter value =");
		act=scan.nextLine();

		
		for(int i=act.length()-1;i>=0;i--)
		{
			
			exp=exp+act.charAt(i);
			
		}

		if
		(act.equals(exp))
		{
			System.out.println("String is pallindrome "+"Yes");
		}
		else
		{
			System.out.println("String is not pallindrome "+"No");
		}
		
		
		
	}
	
	
	
}
