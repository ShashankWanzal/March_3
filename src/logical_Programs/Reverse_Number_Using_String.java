package logical_Programs;

public class Reverse_Number_Using_String
{

	public static void main(String[] args) 
	{
	
		
		int act=12345;
		
		String act_no = Integer.toString(act);
		
		//System.out.println(act_no);
		
		String rev="";
		
		for(int i=act_no.length()-1;i>=0;i--)
		{
			rev=rev+act_no.charAt(i);
			
			
		}
		
		//System.out.println(rev);
		
		int revno = Integer.parseInt(rev);
		
		System.out.println(revno);
		
		

	}
}
