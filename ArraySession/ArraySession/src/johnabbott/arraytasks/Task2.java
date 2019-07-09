package johnabbott.arraytasks;

public class Task2 {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 10, 12, 10, 11, 15, 15, 15, 15, 14 };

		printNonDuplicates(arr);

	}

	private static void printNonDuplicates(int[] arr) {

		java.util.Arrays.sort(arr);

		// to have the length of non repeated
		int counter = 0;
		// temp array to save the non repeated
		int[] tempArray = new int[arr.length];

		// Loop through elements
		for (int i = 0; i < arr.length - 1; i++) {
			// check the elements besides
			if (arr[i] != arr[i + 1]) {
				tempArray[counter] = arr[i];
				counter++;
			}
		}

		// we didn't check the last element and always it 
		// needs to be added to the temp array
		tempArray[counter++] = arr[arr.length - 1];

		// print the temp array
		for (int j = 0; j < counter; j++) {
			System.out.println(tempArray[j]);
		}
	}

}
