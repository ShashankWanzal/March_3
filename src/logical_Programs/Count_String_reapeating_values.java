package logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Count_String_reapeating_values
{

	public static void main(String[] args)
	{
	
		String str="abc abcd abc abcd xyz xyz abcd aabb ccdd aabb ccdd xyz ab";
		
		String ar[]=str.split(" ");
		
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			
			String s1 = ar[i];    
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
			
		}
		
		Set<String> str1 = mp.keySet();
		
		for(String str2:str1)
		{
			System.out.println(str2+"="+mp.get(str2));
		}
		
		
		
		
	}
	
}
