import java.util.Scanner;

public class Day4 {
	
	public static void checkNumber(int number)
	{
		if(number>0)
		{
			System.out.println(number+" "+"Is postive");
		}
		else if(number<0)
		{
			System.out.println(number+" "+"Is Negative");
		}
		else
		{
			System.out.println(number+" "+"is Equal to zero");
		}
	}
	
	
	public static void checkEvenOrOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" "+"is Even");
		}
		else {
			System.out.println(num+" "+"is odd");
		}
	}
	
	public static int sum(int n)

	{
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem = n%10;
			sum=sum+rem;
			n=n/10;

			
		}
		return sum;	
		
	}
	public static void main(String[] args) {
		
		//1. positive or negative number.
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		checkNumber(number);
		
		//2. Even or Odd
		int num = in.nextInt();
		checkEvenOrOdd(num);
		
		//3.Enterd number sum  n natural number.
		int n = in.nextInt();
		int res = sum(n);
		System.out.println(res);
		
		// for first n number of sum
        int n1 =in.nextInt();
        System.out.println(n1*(n1+1)/2);
        
	}

}
