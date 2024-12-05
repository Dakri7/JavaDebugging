package exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise2Inspect {
	
	public double average(int[] input) {
		double acc = 0;
		
		//calculate i[0]/l + i[1]/l + ... + i[l-1]/l
		for(int i = 0; i < input.length; i++) {
			acc += input[i] / input.length;
		}
		
		return acc;
	}
	
	public String cheerForCountryCode(Map<String, String> map, String s) {
		try {
		//Get the first 3 letters as a key
		return "Your country scored: ".concat(map.get(s.substring(0, 2)).trim().concat("!!!"));
		} catch (NullPointerException e) {
			//Newer java versions have too good error messages for this example to work
			throw new NullPointerException("null");
		}
	}
}
