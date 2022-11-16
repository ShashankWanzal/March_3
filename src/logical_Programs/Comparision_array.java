package logical_Programs;

public class Comparision_array
{

	
	public static void main(String[] args) 
	{
	
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {1,2,3,4,5,6,7};	
		
		boolean status=true;
		
		if(a.length==b.length)
		{
			
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
			}
		
		}
		else
		{
		status=false;
		}
		
		
		System.out.println(status);
		
	}
	
	
	
}
