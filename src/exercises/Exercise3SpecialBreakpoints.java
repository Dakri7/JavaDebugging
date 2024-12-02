package exercises;


public class Exercise3SpecialBreakpoints {
	
	//Using conditional breakpoints
	public int fibonacci(int n) {
		if ((n != 1) || (n != 0)) {
			return fibonacci(n-1) + fibonacci(n-2);
		} else if (n == 1) {
			return 1;
		} else {
			return 0;
		}
	}
	
	//Using exception breakpoints
	public int[] averageSpeeds(int[] startTimes, int[] endTimes, int[] distanceTraveled) {
		int[] speeds = new int[startTimes.length];
		for(int i = 0; i < startTimes.length; i++) {
			speeds[i] = distanceTraveled[i] / (endTimes[i] - startTimes[i]);
		}
		return speeds;
	}
}
