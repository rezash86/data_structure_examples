package johnabbott.arraytasks;

public class Task4 {
	
	
	public static void main(String[] args) {
		String[][] colors = new String[][] {{"red","orange", "purple"}, {"green","blue", "indigo"}};
		
		for(int i=0;i< colors.length; i++) {
			for (int j =0 ;j<colors[i].length; j++) {
				if(colors[i][j] == "purple") {
					colors[i][j] = "yellow";
				}
				System.out.println(colors[i][j]);
			}
			
			
		}
		
	}
}
