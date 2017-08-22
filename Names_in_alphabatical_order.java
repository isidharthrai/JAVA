import java.util.Scanner;
public class Names_in_alphabatical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = new String [3];
		Scanner sc = new Scanner ( System.in );
		System.out.println("Enter three names:");
		for(int i=0; i<3 ; i++)
		{
			name[i]=sc.next();
		}
		String swap;
		for(int i=0; i <name.length ;i++)
		{
			for(int j=0; j<name.length; j++)
			{
				if(name[i].compareTo(name[j])>0) 
				{
					swap = name[i];
					name[i]=name[j];
					name[j]=swap;
				}
			}
		}
		System.out.println("Name in Alphatical Order:");
		for(int i=name.length-1; i>=0 ; i--)
		{
			System.out.print(name[i]+", ");
		}
	}

}
