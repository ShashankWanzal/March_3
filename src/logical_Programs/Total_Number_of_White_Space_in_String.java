package logical_Programs;

public class Total_Number_of_White_Space_in_String 
{

	public static void main(String[] args) 
	{
	
		
		String str="ab bc cd de ef      ";
		
		int value=0;
		
		for(int i=0;i<=str.length()-1;i++)   //0
		{
			
			char count = str.charAt(i);
			
			if(count==' ')
			{
				value++;
			}
			
				
		}
		
		System.out.println("Total number of White Spaces in given String="+value);
				
		
	}
	
	
	
}
