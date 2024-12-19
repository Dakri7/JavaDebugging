package exercises;

public class BonusExerciseVolatile {

    // Are we done yet?
	private boolean doneWaiting = false;

    /**
     * Waits for a second while and returns the parameter back
     * @param n This value will be returned back
     * @return The parameter
     */
	public int resultAfterAWhile(int n) {
        // Creates a new thread that will run in the background and set the doneWaiting variable after a second
		Thread schedular = new Thread() {
            // This is executed when the trhead is started
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
        // Wait until the other variable sets the flag
		while(!doneWaiting);
		return n;
	}
}
