package johnabbott.excersices.overloading;

public class PrintAreaOverLoading {
	
	/**
	 * 
	 * @param lenght : this is the length of the rectangle
	 * @param breadth
	 * @return
	 */
	public double printArea(int lenght, int breadth) {
		return lenght * breadth;
	}
	
	
	
	
	public double printArea(int lenght) {
		return lenght * lenght;
	}
	
	
}
