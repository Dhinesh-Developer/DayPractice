import java.util.Scanner;
public class Day3 {

	public static void main(String[] args) {
		
		// check the number is divisible by 2 and 3
	/*	Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		if(n%2==0 && n%3==0)
		{
			System.out.println("The Number is divided by 2 and 3");
		}
		
		
		// if the number is two digit print yes or no
		
		int a = in.nextInt();
		if(a>=10 && a<=99)
		{
			System.out.println("a is a two digit number");
		}
		
		
		
		
		//if the number ending with zero or not
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		if(n%10==0)
		{
			System.out.println("Enging with Zero");
		}
		else {
			System.out.println("Not Ending with zero");
		}
	
		
		// if the number is ending with 53 or not
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%100==53)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
			*/
		//print the number except last two digits
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
	   System.out.println(num/100);
		
	}
	
	

}
