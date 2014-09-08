/**
*Program to check if all the chars of a string are unique
* using extra data structures is allowed
* time complexity O(n) space complexity O(n)
* /

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllUnique {
	
	private static Scanner sc;
	
	public static boolean isAllUnique(String input)
	{
		char arr[] = input.toCharArray();
		
		Set<Character> charSet = new HashSet<Character>();
		
		for(int i=0; i < arr.length ; i++ )
		{
			charSet.add(arr[i]);
		}
		
		if(arr.length > charSet.size())
			return false;
		
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


