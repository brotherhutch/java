package assign1;

/*
 * Assume that a runner runs 14 kilometers in 45 minutes and 10 seconds.
 * Write a program that displays the average speed.
 */
public class Assign1_10 {
	
	public Assign1_10()
	{
		double distanceInKms = 14;
		double timeInMins = 45 + (10 / 60);
		double speedInKmsPerMin = distanceInKms / timeInMins;
		double speedInKmsPerHr = speedInKmsPerMin * 60;
		
		System.out.printf("Average speed for a 14 Km run in 45 min and 10 sec: %.2f Km/hr",speedInKmsPerHr);
		
		
	}
}
