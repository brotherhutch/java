package textbook;

import java.util.Scanner;

/**
 * Write a program that reads student scores, gets the best score, and
 * then assigns grades based on the following scheme:
 * Grade is A if score is >= best - 10
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades.
 *
 */
public class RelativeGrades {

	public RelativeGrades() {
		
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = 0;
		int[] scores;
		int bestScore = 0;
		
		System.out.print("Enter the number of students: ");
		
		if(scanner.hasNextInt())
		{
			numberOfStudents = scanner.nextInt();
		}
		else
		{
			System.out.println("You must enter an integer for number of students.");
			System.exit(0);
		}
		
		// prepare scores array with number of students
		scores = new int[numberOfStudents];
		
		System.out.printf("Enter %d scores (separated by spaces):", numberOfStudents);
		
		for(int i = 0; i < numberOfStudents; i++)
		{
			if(scanner.hasNextInt())
			{
				scores[i] = scanner.nextInt();
			}
			else
			{
				System.out.printf("You must enter %d integers as student scores.");
				System.exit(0);
			}
		}
		
		// get best score
		bestScore = getMaxScore(scores);
		
		// display scores
		for(int i = 0; i < scores.length; i++)
		{
			System.out.printf("Student %d score is %d and grade is %s%n", i, scores[i], getGrade(bestScore, scores[i]));
		}
		
		scanner.close();
	}
	
	/**
	 * Return grade according to reference score
	 */
	private String getGrade(int maxScore, int score)
	{
		String grade = "";
		
		if(score >= (maxScore - 10))
		{
			grade = "A";
		}
		else if(score >= (maxScore - 20))
		{
			grade = "B";
		}
		else if(score >= (maxScore - 30))
		{
			grade = "C";
		}
		else if(score >= (maxScore - 40))
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
		return grade;
	}
	
	/**
	 * Return the highest score in the scores array
	 * 
	 * @param scores the array of scores to check
	 * @return the highest score
	 */
	private int getMaxScore(int[] scores)
	{
		int highScore = 0;
		
		for(int score : scores)
		{
			if(highScore < score)
			{
				highScore = score;
			}
		}
		
		return highScore;
	}

}
