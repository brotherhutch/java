package textbook;

import java.util.Scanner;

public class PalindromeInteger {
	
	public PalindromeInteger()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer to test if it is a palindrome: ");
		
		if(scanner.hasNextInt())
		{
			if(isPalindrome(scanner.nextInt()))
			{
				System.out.println("Your number is a palindrome!");
			}
			else
			{
				System.out.println("Your number is not a palindrome.");
			}
		}
	}
	
	public static int reverse(int number)
	{
		int reversedNum = 0;
		int tensDigit = 0;
		
		while(number > 0)
		{
			// isolate tens digit
			tensDigit = number % 10;
			
			// add tens digit to beginning of reversed number
			reversedNum = (reversedNum * 10) + tensDigit;
			
			// remove tens digit
			number = number / 10;
		}
		
		return reversedNum;
	}
	
	public static boolean isPalindrome(int number)
	{
		if(number == reverse(number))
		{
			return true;
		}
		return false;
	}
}
