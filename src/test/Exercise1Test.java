package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.Exercise1Step;

class Exercise1Test {

private Exercise1Step ex;
	
	@BeforeEach
	private void beforeAll() {
		ex = new Exercise1Step();
	}
	
	@Test
	void testMyFirends() {
		List<String> myFriends = ex.myFreinds();
		List<String> expected = Arrays.asList("New Me", "Bob", "Eve");
		assertEquals(expected, myFriends);
	}
}
