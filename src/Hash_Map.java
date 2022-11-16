import java.util.HashMap;

public class Hash_Map 
{

	
	public static void main(String[] args)
	{
	

		//Keys & Value 
		// UserId Pass 

		
		HashMap<String,Character> map=new HashMap<String,Character>();
		
		map.put("shubham", 'A');
		map.put("Vanita", 'A');
		map.put("Abhijit", 'A');
		map.put("Harshal", 'A');
		
		int size = map.size();
		
		System.out.println(size);
		
		System.out.println(map);
		
		map.remove("Abhijit");
		
		System.out.println(map);
		
		System.out.println(map.containsKey("Abhijit"));
		
		map.replace("Harshal", 'B');
		
		System.out.println(map);
		
		System.out.println(map.get("Harshal"));
		
		//map.replace('B', "Abhijit");
		
		//map.replace('B', "Harshal", "Abhijit");
		
		//map.replaceAll("ab");
		
		//System.out.println('C');
		
		
		
	}
	
	
}
