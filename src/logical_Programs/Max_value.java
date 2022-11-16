package logical_Programs;

public class Max_value 
{

	public static void main(String[] args) 
	{
	
		
		int a[]= {1000,20,30,40,10,100,200,500};
		int max=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			
			if(a[i]<max)
			{
				
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		
	}
	
}
