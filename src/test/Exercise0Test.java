package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.Exercise0Sysout;

class Exercise0Test {
	
	private Exercise0Sysout ex;
	
	@BeforeEach
	void beforeEach() {
		ex = new Exercise0Sysout();
	}

	@Test
	void testRange1() {
		int[] ret = ex.rangeArray(5);
		assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5}, ret);
	}
	
	@Test
	void testRange2() {
		int[] ret = ex.rangeArray(2, 5);
		assertArrayEquals(new int[] {2, 3, 4, 5}, ret);
	}
}
