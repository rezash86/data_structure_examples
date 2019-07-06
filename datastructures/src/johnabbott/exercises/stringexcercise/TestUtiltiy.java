package johnabbott.exercises.stringexcercise;

public class TestUtiltiy {
	
	public static void main(String[] args) {
		boolean hasRepeated = StringUtilty.hasRepeated("ABTU");
		int letterCount = StringUtilty.letterCount("rte123");
		boolean hasVowelSound = StringUtilty.hasVowelSound("hhhh");
		String checkColor = StringUtilty.checkColor("CCCRED");
		
		String wordSeperator = StringUtilty.getWordSeperator("word", "x", 4);
		
		
//		System.out.println(hasRepeated);
//		System.out.println(letterCount);
//		System.out.println(hasVowelSound);
//		System.out.println(checkColor);
		System.out.println(wordSeperator);

	}
}
