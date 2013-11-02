package assign2;

import java.util.Scanner;

public class Assign2_19 {
	
	public Assign2_19()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 127: ");
		
		int ch = scanner.nextInt();
		
		System.out.printf("The ASCII character for that number is %s", (char)ch);
	}

}
