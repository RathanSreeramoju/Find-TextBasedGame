package Textbasedgame;

/**
 * Main class where we call the method to run the game
 * 
 * @author rathan
 *
 */
public class Main {

	public static void main(String[] args) {
		// Creates the object find to access the methods
		StageOne find = new StageOne(0, 0);
		// Calling playersetup method for entering player details
		find.playerSetup();
		// Calling find method where game starts here
		find.find();

	}

}
