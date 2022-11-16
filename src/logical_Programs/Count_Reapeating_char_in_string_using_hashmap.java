package logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Count_Reapeating_char_in_string_using_hashmap
{

	
	public static void main(String[] args)
	{
	
		
		String str="aaabcdefabcdaaadddssshh";
		
		HashMap<Character, Integer>  map=new HashMap<Character, Integer>();
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char charValue = str.charAt(i);  //i=0 a  i=1 a
			
			if(map.containsKey(charValue))    //map=a
			{
				
				map.put(charValue, map.get(charValue)+1);  //(a,1+1)=a,2
			}
			else
			{
				map.put(charValue, 1);   //map.put (a,1)
			}	
		}
		
		Set<Character> key = map.keySet();
		
		for(Character op:key)
		{
		System.out.println(op+"= "+map.get(op));
			
		}
		
		
		
		
	}
	
	
	
}
