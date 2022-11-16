package logical_Programs;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
		String str="abcdef";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);    //  i=5   rev=0+f   =f   i=4  rev=f+e   =fe  i=3  rev=fe+d=fed 
										// i=2 rev=fed+c=fedc    
			
		}
		
		System.out.println("rev string="+rev);
		
		System.out.println("nomal String="+str);
		
		
		
		
	}
	
}
