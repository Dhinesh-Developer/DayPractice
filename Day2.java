import java.util.Scanner;
public class Day2 {
	
	public static void main(String[] args)
	// Error Program
	{
		/*Scanner in = new Scanner (System.in);
		String ch = in.next();
	
		if(isVowel(ch))
		{
			System.out.println(ch + " is a Vowel");
		}
		else
		{
			System.out.println(ch=" is not a Vowel");
		}
	
		
		// check if a number is power of 2
		 // input = 16,15 output =power of two,not a power of two
		 
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
		{
			System.out.println(n + " given  number is power of 2");
		}
		
		
		
		// write a program to check if a given number is palindrome or not
		//input racecar output = is a palindrome
		
		Scanner in = new Scanner (System.in);
		String s = in.nextLine();
		
		int i=s.length();
		int j = s.length();
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
				else {
					System.out.println("Not a Palindrome");
				}
				
			
		}
		System.out.println("Ia a Palindrome");
			*/
		
		// determine a how many digits are in number
		
		
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int count =0;
		
		while(n>0)
		{
		   n = n/10; 
		   count++;
		
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
	}
}
