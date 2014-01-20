package textbook;

import java.util.Scanner;

/*
 * Write a program that reads the integers between 1
 * and 100 and counts the occurrences of each. Assume the input ends with 0.
 */
public class Occurrences {

	public Occurrences() {
		
		Scanner scanner = new Scanner(System.in);
		int[] occurrenceArray = new int[100];
		int userInput;
		for(int i = 0; i < occurrenceArray.length; i++)
		{
			occurrenceArray[i] = 0;
		}
		
		System.out.println("Enter some integers between 1 and 100 separated by spaces.");
		System.out.println("The last integer must be a zero.");
		
		while(true)
		{
			if(scanner.hasNextInt()){
				userInput = scanner.nextInt();
				if(userInput == 0)
				{
					break;
				}
				occurrenceArray[userInput - 1]++;
			}
		}
		
		for(int i = 0; i < occurrenceArray.length; i++)
		{
			if(occurrenceArray[i] > 0)
			{
				String times = (occurrenceArray[i] < 2) ?  "time" : "times";
				System.out.printf("%d occurs %d %s%n", i+1, occurrenceArray[i], times);
			}
		}
		
		scanner.close();
	}

}
