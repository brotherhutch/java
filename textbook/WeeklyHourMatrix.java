package textbook;

import java.util.Arrays;
import java.util.Comparator;

/*
Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following array
stores the work hours for eight employees. Write a program that displays employees
and their total hours in decreasing order of the total hours.
 */
public class WeeklyHourMatrix {
	
	private int[][] hourMatrix = {
			{2,4,3,4,5,8,8},
			{7,3,4,3,3,4,4},
			{3,3,4,3,3,4,4},
			{9,3,4,7,3,4,1},
			{3,5,4,3,6,3,8},
			{3,4,4,6,3,4,4},
			{3,7,4,8,3,8,4},
			{6,3,5,9,2,7,9}
			};
	
	public WeeklyHourMatrix()
	{
		// prepare a result array, storing employee number and total hours
		int[][] results = new int[8][2];
		int sum = 0;
		
		// sum and store hours
		for (int i = 0; i < hourMatrix.length; i++) {
			sum = 0;
			for (int j = 0; j < hourMatrix[i].length; j++) {
				sum += hourMatrix[i][j];
			}
			results[i][0] = i; // employee number
			results[i][1] = sum; // employee hours
		}
		
		// sort results array
		Arrays.sort(results, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(b[1], a[1] );
		    }
		});
				
		// print out sorted employees and hours
		System.out.println("Employee    Hours");
		System.out.println("----------- -----");
		for (int i = 0; i < results.length; i++) {
			System.out.printf("Employee %d: %d%n", results[i][0], results[i][1]);
		}
	}

}
