public class Main
{
	public static void main(String[] args)
	{
		//Part A
		System.out.println("Part A");
		String[] wordArray = {"wheels", "on", "the", "bus"};
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for (int k = 0; k < 6; k++)
		{
			System.out.print(sChooser.getNext() + " ");
		}
		
		//Part B
		System.out.println("\n\nPart B");
		RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
		for (int k = 0; k < 4; k++)
		{
			System.out.print(letterChooser.getNext());
		}
	}
}
