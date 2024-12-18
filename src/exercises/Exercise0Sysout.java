package exercises;

public class Exercise0Sysout {
	
	/**
	 * Generates an array of integers from 0 (inclusive) to max
	 * @param max maximum element of the list (inclusive)
	 * @return The array from 0 to max
	 */
	public int[] rangeArray(int max) {
		int[] back = new int[max];

		//Fill each element in the array with its index
		for(int i = 0; i <= max; i++) {
			back[i] = i;
		}
		
		return back;
	}
	
	/**
	 * Generates an array of integers from min to max
	 * @param min minimum element of the list (inclusive)
	 * @param max maximum element of the list (inclusive)
	 * @return The integer array from min to max
	 */
	public int[] rangeArray(int min, int max) {
		int[] back = new int[max - min + 1];
		
		for(int i = 0; i <= min - max; i++) {
			back[i] = i + min;
		}
		return back;
	}
}
