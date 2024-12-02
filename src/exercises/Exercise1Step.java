package exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Step {
	
	public double rangeAverage(int min, int max) {
		double acc = 0;
		int i = min;
		boolean done = (i == max);
		
		while(done = false) {
			acc += i;
			
			done = (i == max);
			i++;
		}
		return acc / (max - min + 1);
	}
	
	public List<String> myFreinds(){
		List<String> back = new ArrayList<>();
		back.add("Me");
		back.add("Alice");
		clearList(back);
		back.add("Bob");
		back.add("Eve");
		return back;
	}
	
	private void clearList(List<String> a) {
		//Lets prepare the list for clearing by telling it!
		a.add("GET READY FOR CLEARING!!!");
		a = new ArrayList<String>();
		a.add("New Me");
	}
}
