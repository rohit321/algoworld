import java.util.Scanner;

public class AllUnique2 {
	private static Scanner sc;
	
	public static boolean isAllUnique(final String input)
	{
		final char[] arr = input.toCharArray();
		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i+1;j<arr.length ; j++)
			{
				if(arr[i] == arr[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		System.out.println("Enter string");
		sc = new Scanner(System.in);
		String input = sc.next();
		
		String result = isAllUnique(input) ? "all chars are unique" : "repeated chars present";
		
		System.out.println(result);
	}

}
