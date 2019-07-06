package johnabbott.exercises.stringutils;

public class StringTest {
	
	public void testStringTypes() {
		//String
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		StringBuffer appendedbuffer = buffer.append("test");
		
		
	}
	
	public synchronized int checkStrings() {
		return 0;
	}
	
	
	public static void main (String[] args) {
//		StringBuffer buffer = new StringBuffer("A ");
//		StringBuffer appendedbuffer = buffer.append("test");
//		
//		
//		
//		System.out.println(buffer);
//		System.out.println(appendedbuffer);
//		System.out.println(buffer);
//		
//		
//		String str = new String("B ");
//		String concated = str.concat("test");
//		
//		System.out.println(str);
//		System.out.println(concated);
//		System.out.println(str);
		
		
		String s1 = new String("TOTO1");
		
		//we have only one object
		String s2 = "TOTO2";
		String s3 = "TOTO2";
		
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
	}
}
