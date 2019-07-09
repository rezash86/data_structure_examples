package johnabbott.arraytasks;

public class Task3 {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 34, 5, 7, 7 };

		int[] reverseWithTemp = reverseWithTemp(arr);
		int[] reverseWithoutTemp = reverseWithoutTemp(arr);
		
		
		System.out.println("Reverse with temp array");
		
		for(int j=0; j< reverseWithTemp.length; j++) {
			System.out.println(reverseWithTemp[j] + "  ");
		}
		
		System.out.println("Reverse without temp array");
		for(int j=0; j< reverseWithoutTemp.length; j++) {
			System.out.println(reverseWithTemp[j] + "  ");
		}

	}

	public static int[] reverseWithTemp(int[] arr) {
		int[] temp = new int[arr.length];
		
		int cnt = 0;
		for(int i=arr.length -1; i>= 0  ; i--) {
			temp[cnt] = arr[i];
			cnt++;
		}
		
		return temp;
	}

	public static int[] reverseWithoutTemp(int[] arr) {
		
		int k = arr.length -1;
		for(int i=0; i< arr.length /2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			k--;
		}
		
		return arr;
	}

	
	
	
	
	
	
	
	
}
