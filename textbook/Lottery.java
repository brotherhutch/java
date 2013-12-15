package textbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lottery {
	
	public Lottery()
	{
		int lotteryNum = (int)(Math.random() * 900) + 100;
		int guess = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Guess a three-digit number to try and win the lottery: ");
		
		if(scanner.hasNextInt())
		{
			guess = scanner.nextInt();
		}
		else
		{
			System.out.println("You must enter an integer.");
			System.exit(0);
		}
		
		if(guess < 100 || guess > 999)
		{
			System.out.println("You must enter three-digit number.");
			System.exit(0);
		}
		
		int digit1 = guess % 10;
		int digit2 = (guess % 100) / 10;
		int digit3 = guess / 100;
		
		ArrayList guesses = new ArrayList();
		
		guesses.add(digit1);
		guesses.add(digit2);
		guesses.add(digit3);
		
		int lottery1 = lotteryNum % 10;
		int lottery2 = (lotteryNum % 100) / 10;
		int lottery3 = lotteryNum / 100;
		
		ArrayList lotteryNums = new ArrayList();
		
		lotteryNums.add(lottery1);
		lotteryNums.add(lottery2);
		lotteryNums.add(lottery3);
		
		// copy lotteryNums for the right numbers / wrong order check
		ArrayList comparableLotteryNums = new ArrayList(lotteryNums);
		
		Iterator<ArrayList> it = comparableLotteryNums.iterator();
		
		// right numbers wrong order check: if the array is empty after this
		// we have the right numbers but in the wrong order
		for(Object g : guesses)
		{
			while(it.hasNext())
			{
				if(it.next() == g)
				{
					it.remove();
				}
			}
			// "reset" the iterator
			it = comparableLotteryNums.iterator();
		}
		
		System.out.printf("The computer's lottery number is: %d\n", lotteryNum);
		
		if(guess == lotteryNum)
		{
			System.out.println("You guessed it exactly right! You win $10,000.");
		}
		else if ( comparableLotteryNums.isEmpty() )
		{
			System.out.println("You guessed the correct numbers in the wrong order. You win $3,000.");
		}
		else if( lotteryNums.contains(digit1) || lotteryNums.contains(digit2) || lotteryNums.contains(digit3) )
		{
			System.out.println("You guessed at least one digit in the lottery number correctly. You win $1,000.");
		}
		else
		{
			System.out.println("Sorry, you are a loser.");
		}
		
		scanner.close();
	}
}
