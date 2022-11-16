package logical_Programs;

public class Amstrong_Number 
{
	
	public static void main(String[] args)
	{
	
		//  number/  ===> number 
		//153%10   ==>153
		
		int act=153;
		int sum=0;
		
		for(int i=act; i>0;i=i/10)     
		{
	 
			int rem=i%10;    
			
			System.out.print("rem="+rem);
			
			sum=(sum+(rem*rem*rem)); 
			
			System.out.println(" sum="+sum);
			
			
		}
		
		if(act==sum)
		{
			System.out.println("it is Amstrong Number");
		}
		else
		{
			System.out.println("it is not a Amstrong Number");
		}
		
		System.out.println(sum);
		
		
	}
	
	
	
}
