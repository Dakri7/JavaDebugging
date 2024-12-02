package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.Exercise2Inspect;

class Exercise2Test {
	
	private Exercise2Inspect ex;

	@BeforeEach
	void setUp() throws Exception {
		ex = new Exercise2Inspect();
	}

	@Test
	void testAverage() {
		double avg = ex.average(new int[]{1, 6, 2, 5});
		assertEquals(3.5, avg);
	}
	
	@Test
	void testCheer() {
		Map<String, String> map = new HashMap<>();
		map.put("GER", "42 Points");
		map.put("FRA", "31 Points");
		String cheer = ex.cheerForCountryCode(map, "GERMANY");
		assertEquals("Your country scored: 42 Points!!!", cheer);
	}
}
