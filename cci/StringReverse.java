import java.util.Scanner;

public class StringReverse {
	private static Scanner sc;
	
	public static String reverse(final String original)
	{
		final char[] arr = original.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length -1 ; i>=0; i--)
		{
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter string");
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
		
		System.out.println(reverse(input));
	}
	

}
