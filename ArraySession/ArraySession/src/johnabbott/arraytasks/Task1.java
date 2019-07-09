package johnabbott.arraytasks;

public class Task1 {
	
	
	
	public static int findLargest(int[] arr) {
		
		
		int biggest = arr[0];
		for(int i=1; i< arr.length; i++) {
			if(biggest < arr[i]) {
				biggest = arr[i];
			}
		}
		
		return biggest;
		
	}
	
	
	public static int findSmallest(int[] arr) {
		
		
		int smallest = arr[0];
		for(int i=1; i< arr.length; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		
		return smallest;
		
	}
	
	
	public static void main(String[] args) {
		int[] testArr = new int[] {12, 3, 4, 15, 6};
		
		System.out.println("largest is = " + findLargest(testArr));
		System.out.println("smallest is =" + findSmallest(testArr));
		
	}
	

}
