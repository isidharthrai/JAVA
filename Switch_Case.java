import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true or false");
		boolean num = sc.hasNext();
		int a = 0;
		if(num==true)
		{
			a=2;
		}
		else if(num==false)
		{
			a=1;
		 }
		else {
			a=0;
		}
		switch(a)
		{
			default:
			{
				System.out.println("Calling Default Case");
			
			}
			case 1:
			{
				System.out.println("Input was false");
				break;
			}
			case 2:
			{
				System.out.println("Input was true");
				break;
			}
		}
	}

}
