package exercises;


public class Exercise3SpecialBreakpoints {

    /**
     * Calculates the n-th fibonacci number. Starting with 0 1
     * Tip: Use conditional breakpoints
     * @param n Index of the fibonacci number
     * @return The n-th fibonacci number
     */
	public int fibonacci(int n) {
        // Index > 1
		if ((n != 1) || (n != 0)) {
			return fibonacci(n-1) + fibonacci(n-2);
		}
        //Index == 1
        else if (n == 1) {
			return 1;
		}
        // Index == 0
        else {
			return 0;
		}
	}

    /**
     * Calculates the average speeds of multiple races. The first elements of each list are for the first race, the second elements for the second race and so on
     * The list must be of the same size. The bug is not that this is not checked
     * Tip: Use exception breakpoints
     * @param startTimes Times the races started
     * @param endTimes Times the races ended
     * @param distanceTraveled Distances of the races
     * @return Average speeds of the races
     */
	public int[] averageSpeeds(int[] startTimes, int[] endTimes, int[] distanceTraveled) {
        // Initialize results array for with one spot for each race
		int[] speeds = new int[startTimes.length];
        // Calculate for each race
		for(int i = 0; i < startTimes.length; i++) {
            // Speed = distance / time
			speeds[i] = distanceTraveled[i] / (endTimes[i] - startTimes[i]);
		}
		return speeds;
	}
}
