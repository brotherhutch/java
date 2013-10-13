package exercises;

import java.text.NumberFormat;

/*
 * The U.S. Census Bureau projects population growth using the following assumptions
 * a. One birth every 7 seconds
 * b. One death every 13 seconds
 * c. One new immigrant even 45 seconds
 * Write a program that displays the population for the next 5 years
 * if the current population is 312,032,486, and one year has 365 days.
 */
public class Assign1_11 {
	
	public Assign1_11()
	{
		int numberOfSecondsInAYear = 365 * 24 * 60 * 60; // aprox.
		int numberOfBirthsInAYear = numberOfSecondsInAYear / 7;
		int numberOfDeathsInAYear = numberOfSecondsInAYear / 13;
		int numberOfImmigrantsInAYear = numberOfSecondsInAYear / 45;
		int currentPopulation = 312032486;
		
		NumberFormat nf = NumberFormat.getInstance(); // to format population with commas
		
		int population = currentPopulation;
		for(int i = 1; i < 6; i++)
		{
			System.out.printf("Year %d population: %s\n", i, nf.format(population));
			population += numberOfBirthsInAYear + numberOfImmigrantsInAYear - numberOfDeathsInAYear;
		}
	}
}
