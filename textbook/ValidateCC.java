package textbook;

import java.util.Scanner;

public class ValidateCC {

	public ValidateCC() {
		
		Scanner scanner = new Scanner(System.in);
		long ccNum = 0;
		
		System.out.println("Enter a credit card number as a long integer:");
		
		if(scanner.hasNextLong())
		{
			ccNum = scanner.nextLong();
			
			if(isValid(ccNum))
			{
				System.out.printf("%d is valid", ccNum);
			}
			else
			{
				System.out.printf("%d is invalid", ccNum);
			}
		}
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number)
	{
		int numLength = getSize(number);
		long prefix1 = getPrefix(number, 1);
		long prefix2 = getPrefix(number, 2);
		int checkSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		
		// length requirement 13 - 16 digits
		if(numLength < 13 || numLength > 16)
		{
			return false;
		}
		// starting number requirement 4,5,37,6
		else if(prefix1 != 4 && prefix1 != 5 && prefix1 != 6 && prefix2 != 37)
		{
			return false;
		}
		// checkSum requirement; checksum must be divisible by 10
		else if(checkSum % 10 != 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number)
	{
		int result = 0;
		int tens = 0;
		int digit = 0;
		
		// take off the first tens digit to access first even digit counted from right
		number = number / 10;
					
		while(number > 0)
		{
			// get the tens digit
			tens = (int)(number % 10);
			
			// double it and get the single digit
			digit = getDigit(2 * tens);
			
			// add it to result
			result += digit;
			
			// jump to next even digit counted from right
			number = number / 100;
		}
		
		return result;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number)
	{
		int result = 0;
		
		if(number < 10)
		{
			result = number;
		}
		else
		{
			result = (number % 10) + (number / 10);
		}
		return result;
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number)
	{
		int sum = 0;
		int tens = 0;
		
		while(number > 0)
		{
			tens = (int)(number % 10);
			sum += tens;
			number = number / 100;
		}
		
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d)
	{
		int sizeNum = getSize(number);
		int sizeD = getSize(d);
		int prefixSize = sizeNum - sizeD;
		long divisor = 0;
		int prefix = 0;
		
		if(prefixSize > 0)
		{
			// create a divisor that will remove the numbers to the right of the prefix
			divisor = (long)(Math.pow(10, (double)prefixSize));
			
			// obtain the prefix
			prefix = (int)(number / divisor);
			
			// check the prefix against d
			if(prefix == d)
			{
				return true;
			}
		}
		return false;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d)
	{
		int size = 0;
		
		while(d > 0)
		{
			d = d / 10;
			size++;
		}
		
		return size;
	}
	
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k)
	{
		int sizeNum = getSize(number);
		int divisorSize = sizeNum - k;
		long divisor = 0;
		
		if(divisorSize > 0)
		{
			// create a divisor that will remove the numbers to the right of the required digits
			divisor = (long)(Math.pow(10, (double)divisorSize));
			
			// obtain the desired digits
			return number / divisor;
		}
		
		return number;
	}

}
