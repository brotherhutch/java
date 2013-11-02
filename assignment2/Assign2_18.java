package assign2;

public class Assign2_18 {

	public Assign2_18()
	{
		System.out.println("A \"random\" uppercase letter: ");
		
		int randomNumber = (int)(System.currentTimeMillis() % 26) + 65;
		
		System.out.print((char)randomNumber);
	}
}
