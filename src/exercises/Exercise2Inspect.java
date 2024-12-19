package exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise2Inspect {

    /**
     * Calculates the average over all elements of a List
     * @param input the List to calculate the average over
     * @return The average of all elements of the List
     */
	public double average(int[] input) {
        //The current sum of partial averages
		double acc = 0;
		
		//calculate i[0]/l + i[1]/l + ... + i[l-1]/l
		for(int i = 0; i < input.length; i++) {
			acc += input[i] / input.length;
		}
		
		return acc;
	}

    /**
     * Cheer for a given country with a cheerful message and its score
     * @param map Map of 3-letter country codes to their scores
     * @param s The country we want to cheer for
     * @return A cheerful message containing the country code
     */
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
