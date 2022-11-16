
public class TestClass
{

	public static void main(String[] args)
	{
		
		String Topper;
		String class_Topper;
	
//		
//		Getter_Setter o1=new Getter_Setter();
//		
//		o1.SetMovieName("RRR");
//		
//	//	System.out.println(o1.GetMovieName());
//		
//		String name = o1.GetMovieName();
//		
//		System.out.println("Movie Name="+name);
		
		
		
//		Sample1 s1=new Sample1();
//		
//		s1.SetName("Nihal");
//		
//		s1.displayName();
//		
//		Topper=s1.GetName();
//		class_Topper=s1.GetName();
//		
//		System.out.println(Topper);
//		System.out.println(class_Topper);
		
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1();
		
		s1.SetName("Abhijeet");
		s2.SetName("Nihal");
		
		String name1 = s1.GetName();
		System.out.println("First Student= "+name1);
		
		String name2 = s2.GetName();
		System.out.println("Second Student="+name2);
		
		
	}
}
