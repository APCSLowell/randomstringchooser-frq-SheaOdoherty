public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
