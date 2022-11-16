package logical_Programs;

public class Prime_Number
{

	public static void main(String[] args)
	{
	
		//Prime No=>No divided by itself & one   ex. 1,5,7,11,13,17    =>even rem=> 
		
		
		int act_no=17;
		int value=0;
		

		for(int i=2;i<act_no;i++)   //i=2   i<act_no       2->10 11    
		{
			
			if(act_no%i==0)   //11%2=>0
			{
				value++;
				break;
				
			}
			
			
		}
		
		if(value==1)
		{
			System.out.println("it is not a prime Number");
		}
		else
		{
			System.out.println("it is a prime number");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
