package assign2;

public class Assign2_6 {

	public static final int NUMBER = 333; // a number between 0 and 1000
	
	public Assign2_6()
	{
		// add all of the digits in the NUMBER
		int number = NUMBER;
		int digit = 0;
		int sum = 0;
		while(true)
		{
			digit = number % 10;
			sum += digit;
			number /= 10;
			if(number == 0)
			{
				break;
			}
		}
		System.out.printf("Adding all of the digits in %d yields %d", NUMBER, sum);
	}
}
