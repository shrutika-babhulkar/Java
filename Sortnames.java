import java.util.*;
class Sortnames
{
	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		String names[] = new String[10];
		
		System.out.println("Enter Names: ");
		for(int i=0;i<10;i++)
		{
			names[i]=sc.nextLine();
		}
		
		Arrays.sort(names);
		
		System.out.println("Alphabetically Sorted Names are:");
		for(String name : names)
		{
			System.out.println(name);
		}
		
	}
}