package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.Exercise3SpecialBreakpoints;

public class Exercise3Test {
	
	private Exercise3SpecialBreakpoints ex;
	
	@BeforeEach
	void beforeEach() {
		ex = new Exercise3SpecialBreakpoints();
	}

	@Test
	void testFibonacci() {
		double fib = ex.fibonacci(5);
		assertEquals(5, fib);
	}
	
	@Test
	void testAverageSpeeds() {
		int[] startTimes = new int[] {0, 5, 17, 3};
		int[] endTimes = new int[] {5, 20, 17, 9};
		int[] distances = new int[] {10, 45, 0, 30};
		int[] expected = new int[] {2, 3, 0, 5};
		int[] actual = ex.averageSpeeds(startTimes, endTimes, distances);
		assertEquals(expected, actual);
	}
}
