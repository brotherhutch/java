package textbook;

/*
 * Write a program that displays all 
 * the numbers from 100 to 200, ten per line,
 * that are divisible by 5 or 6, but not both.
 * Numbers are separated by exactly one space.
 */
public class Divisible56 {
	public Divisible56()
	{
		int lineLength = 0;
		int num = 100;
		while(num <= 200)
		{		
			if(checkDivisibleRule(num))
			{
				System.out.printf("%d ", num);
				lineLength++;
				if(lineLength == 10)
				{
					System.out.println();
					lineLength = 0;
				}
			}
			
			num++;
		}
	}
	
	private boolean checkDivisibleRule(int num)
	{
		if(num % 5 == 0 && num % 6 == 0)
		{
			return false;
		}
		else if(num % 5 == 0 || num % 6 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
