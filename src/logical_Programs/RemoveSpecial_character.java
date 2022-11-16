package logical_Programs;

public class RemoveSpecial_character 
{

	public static void main(String[] args) 
	{
	
		String s="@#$%^&!*Shashank";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
	}
	
}
