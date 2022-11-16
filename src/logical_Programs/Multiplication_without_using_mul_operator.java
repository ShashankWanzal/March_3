package logical_Programs;

import java.util.Scanner;

public class Multiplication_without_using_mul_operator 
{

	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("no1=");
		int no1=scan.nextInt();
		System.out.println("no2=");
		int no2=scan.nextInt();
		System.out.println(no1*no2);
		
		int sum=0;
		
		for(int i=1;i<=no2;i++)
		{
			sum=sum+no1;
			
			//sum=0+40     int i=1
			//40
			
			//i=2
			
			//sum=40+40=80
			
			//i=3
			//80+40=120   =1600
			
		}
		
		System.out.println(sum);
		
	}
	
	
	
	
}
