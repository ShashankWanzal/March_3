package logical_Programs;

public class Rev_no_without_using_string 
{

	public static void main(String[] args)
	{
	
		int num=123456789;
		int value=0;
		int revno=0;
		
		if(num%2==0)
		{
			System.out.println("it is even number ="+num);
		}
		
		System.out.println(num);
		while(value>0)
		{
			
			
			int rem = value%10;
			
			//System.out.print("rem="+rem);
			
			revno=revno*10+rem;   // 5*10+4=54*10+3=543*10+2=5432=5432*10+1=54320+1=54321
			
		//	System.out.print("  revno="+revno);
			
			value=value/10;	
			
			
		//	System.out.println("  num="+num);
		}
		
		System.out.println(revno);
		
		
	}
	
	
}
