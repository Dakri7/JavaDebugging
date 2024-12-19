package exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Step {

    /**
     * Calculates the average over a range of integers
     * @param min minimum element of the average range
     * @param max maximum element of the average range
     * @return The average of all numbers between min and max
     */
	public double rangeAverage(int min, int max) {
        // Save the current sum in here
		double acc = 0;
        //Start at min
		int i = min;
        //we are done, if i == max
		boolean done = (i == max);

        // Loop if we are not done
		while(done = false) {
			acc += i;

            // Are we there yet?
			done = (i == max);
			i++;
		}
		return acc / (max - min + 1);
	}

    /**
     * This is a List of all my friends. I did change my mind during coding this
     * @return A List of all my friends
     */
	public List<String> myFreinds(){
		List<String> back = new ArrayList<>();
		back.add("Me");
		back.add("Alice");
		clearList(back);
		back.add("Bob");
		back.add("Eve");
		return back;
	}

    /**
     * Completely empties any given List gracefully, by telling it before clearing
     * @return An empty List
     */
	private void clearList(List<String> a) {
		//Lets prepare the list for clearing by telling it!
		a.add("GET READY FOR CLEARING!!!");
		a = new ArrayList<String>();
		a.add("New Me");
	}
}
