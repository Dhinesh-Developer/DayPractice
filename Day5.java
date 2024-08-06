import java.util.Scanner;

public class Day5 {
	
	public static void max(int a,int b, int c)
	{
		int max1 = a>b?a:b;
		int max2 = b>c?b:c;
		int max = max1>max2?max1:max2;
		System.out.println(max);
	}
	
	public static void checkYear(int year)
	{
		if(year%400==0 || year%4==0 &&(year%100!=0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
	
	
	public static void CheckPrime(int n)
	{
		if(n<2)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a Prime Number");
					break;
				}
			}
			System.out.println("Is a Prime Number");
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		/*
		//5. Greatest of two numbers.
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b= in.nextInt();
		int max = a>b?a:b;
		System.out.println(max);
		
		
		//5. Greatest of Three  numbers.
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b= in.nextInt();
		int c = in.nextInt();
		max(a,b,c);
		
		
		
		//Leap year or not
		
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		checkYear(year);
		
		*/
		
		// check the number is prime or not
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    CheckPrime(n);
		
	
		
		
	}
	
	

}
