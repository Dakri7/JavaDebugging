package exercises;

public class BonusExerciseVolatile {
	
	private boolean doneWaiting = false;
	
	public int resultAfterAWhile(int n) {
		Thread schedular = new Thread() {
			public void run() {
				try {
					//Wait a second
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//Ignore this catch phrase, we should never land here
					e.printStackTrace();
				}
				doneWaiting = true;
			};
		};
		
		schedular.start();
		while(!doneWaiting);
		return n;
	}
}
