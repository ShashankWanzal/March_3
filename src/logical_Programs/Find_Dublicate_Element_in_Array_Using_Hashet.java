package logical_Programs;

import java.util.HashSet;

public class Find_Dublicate_Element_in_Array_Using_Hashet
{
	
	
	public static void main(String[] args) 
	{
	
		//HashSet 
		
		String ar[]= {"Java","javaScript","C","C++","python","Java","python"};
		
		HashSet<String> set=new HashSet<String>();
		
		for(String str:ar)
		{
		
			// Indentify dublicate 
			
			if(!set.add(str))
			{
				System.out.println(str);
				
			}
		
			
		}
		

	}

	
}
