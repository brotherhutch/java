package textbook;

import java.util.Scanner;

public class SumDigits {

	public SumDigits()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer to display the sum of its digits: ");
		if(scanner.hasNextLong())
		{
			System.out.printf("The sum is: %d", sumDigits(scanner.nextLong()));
		}
	}
	
	public static int sumDigits(long n)
	{
		int tensDigit = 0;
		int sum = 0;
		
		while(n > 0)
		{
			// isolate tens digit
			tensDigit = (int)(n % 10);
			
			// add to sum
			sum += tensDigit;
			
			// remove tens digit
			n = n / 10;
		}
		
		return sum;
	}
}
