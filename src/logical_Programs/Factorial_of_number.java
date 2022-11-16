package logical_Programs;

public class Factorial_of_number 
{

	public static void main(String[] args)
	{
	
		// a=5 ,b=1
		//5*4*3*2*1
		
		int a=5;
		int b=1;
		
		for(int i=a;i>=1;i--)
		{
			b=b*i;    //b=1*5  =5 i4   b=5*4  =20       i3    b=20*3      
 			
		}
		
		System.out.println(b);
		
		
	}
}
