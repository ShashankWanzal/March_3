package logical_Programs;

import java.util.HashSet;

public class Remove_dublicate_from_Array 
{

	public static void main(String[] args) 
	{
	
		//HashSet 
		
		String ar[]= {"Java","javaScript","C","C++","python","Java","python"};
		
		HashSet<String> set=new HashSet<String>();
		
		for(String str:ar)
		{
		
			set.add(str);
		
			
		}
		
		System.out.println(set);

	}
	
	
	
}
