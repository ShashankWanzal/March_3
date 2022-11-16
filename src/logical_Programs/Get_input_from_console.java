package logical_Programs;

import java.util.Scanner;

public class Get_input_from_console 
{

	public static void main(String[] args)
	{
	
		//scanner 
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter the value");
		
		int value = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value+value2);
		System.out.println(value2);
		
	}
	
	
}
