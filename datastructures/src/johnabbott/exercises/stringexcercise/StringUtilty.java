package johnabbott.exercises.stringexcercise;

public class StringUtilty {
	
	public static boolean hasRepeated(String str) {
		
		for (int i=0; i< str.length() ; i++) {
			for (int j=i + 1 ; j < str.length() ; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static int letterCount(String str) {
		//Character.isLetter(ch)
		int sum = 0;
		for (int i =0 ; i<str.length(); i++) {
			boolean isLetter = Character.isLetter(str.charAt(i));
			if(isLetter) {
				sum++;
			}
		}
		return sum;
	}
	
	public static boolean hasVowelSound(String str) {
		
		
		for(int i = 0; i< str.length() ; i++) {
			
			if(str.toLowerCase().charAt(i) == 'o' || 
					str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'i' ||
					str.toLowerCase().charAt(i) == 'u' || str.toLowerCase().charAt(i) == 'e') {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	public static String checkColor(String colorToCheck) {
		
		if (colorToCheck.toLowerCase().startsWith("red") || colorToCheck.toLowerCase().startsWith("blue")) {
			return colorToCheck.substring(0, 3);
		}
		else {
			return "";
		}
	}
	
	
	public static String getWordSeperator(String word, String seperator, int count) {
		int starter= 1;
		String temp = word;
		while(starter < count) {
			temp +=  seperator + word;
			starter++;
		}
		return temp;		
	}
	

}
