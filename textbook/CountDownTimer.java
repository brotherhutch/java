package textbook;

import java.util.Scanner;

public class CountDownTimer {
	public CountDownTimer()
	{
		Scanner scanner = new Scanner(System.in);
		int seconds = 0;
		
		System.out.print("Enter a number of seconds to count down from: ");
		
		if(scanner.hasNextInt())
		{
			seconds = scanner.nextInt();
		}
		else
		{
			System.out.println("You must enter a number of seconds");
			System.exit(0);
		}
		
		if(seconds == 0)
		{
			System.exit(0);
		}
		
		long startTime = System.currentTimeMillis();
		while(true)
		{
			long elapsedTime = System.currentTimeMillis() - startTime;
			
			if(elapsedTime / 1000 >= 1)
			{
				seconds--;
				if(seconds == 0)
				{
					break;
				}
				System.out.printf("%d seconds remaining%n", seconds);
				startTime = System.currentTimeMillis();
			}
		}
		System.out.println("Stopped");
		
		scanner.close();
	}
}
