package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.BonusExerciseVolatile;

public class BonusExerciseVolatileTest {
	
private BonusExerciseVolatile ex;
	
	@BeforeEach
	private void beforeAll() {
		ex = new BonusExerciseVolatile();
	}

	@Test
	void testSleep() {
		double back = ex.resultAfterAWhile(42);
		assertEquals(42, back);
	}
}