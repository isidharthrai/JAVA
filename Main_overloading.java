public class Main_overloading 
{
	public static void main(String[] args)
	{
		main(100);
		main("Sidharth","Rai");
	}
	public static void main(int a) 
	{
		System.out.println(a);
	}
	/*Created by Sidharth Rai*/
	public static void main(String arg1, String arg2) 
	{
		System.out.println(arg1+" "+arg2);
	}
}	 