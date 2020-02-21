package Textbasedgame;

import java.util.*;

/*
 * Here this class implements level two using the stage one parent class and 
 * uses interface one and interface two
 */

public class StageTwo extends StageOne implements InterfaceOne, InterfaceTwo {

	int choice;
	int moves;
	Scanner scanner = new Scanner(System.in);

	/*
	 * Level two starts from here
	 * 
	 * Uses constructor to carry the moves from first stage
	 * 
	 * @param choice - to be chosen by the user to go further in to the game
	 * 
	 * @param moves - number of moves are counted which are taken by the user so
	 * far.
	 */
	public StageTwo(int choice, int moves) {
		super(choice, moves);
	}

	/*
	 * implements method from interface given description about the building and a
	 * choice is given regarding the box.
	 */
	@Override
	public void open() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("you are at level two now");
		System.out.println("Building is completely dark and there is a box infront of you");
		System.out.println("\n1: Open box");
		System.out.println("\n2: Go back ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			box();
		} else if (choice == 2) {
			east();
		} else {
			choicenotfound();
			open();
		}

	}

	/*
	 * Prints Choice not found if the user selects the choice out of given options.
	 */
	public void choicenotfound() {
		System.out.println("Choice not found");

	}

	/*
	 * User was given a hint through a slip and choices and the number of moves will
	 * be calculated.
	 */
	public void box() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You found a slip which indicates");
		System.out.println("\"Everyone will succeed in life if they do the things right \"");
		System.out.println("\n1: Go Right");
		System.out.println("\n2: Go left ");
		System.out.println("\n3: Go Forward ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			right();
		} else if (choice == 2) {
			left();
		} else if (choice == 3) {
			forward();
		} else {
			choicenotfound();
			open();
		}
	}

	/*
	 * Given description about the wrong choice user has made.
	 */
	@Override
	public void forward() {
		++moves;
		System.out.println("It's very dark in here you cannot move in dark, try to find light");
		System.out.println("\nYour Moves " + moves);
		open();
	}

	@Override
	public void left() {
		++moves;
		System.out.println("There is a room in the corner and it is empty ");
		System.out.println("\nYour Moves " + moves);
		open();
	}

	@Override
	public void right() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a room ");
		System.out.println("\n1: Open Door");
		System.out.println("\n2: Go left ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			door();
		} else if (choice == 2) {
			left();
		} else {
			choicenotfound();
			right();
		}

	}

	/*
	 * Choices have been given to the user to light up the building and the moves
	 * will counted.
	 */
	public void door() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a Lantern and a torch on the table ");
		System.out.println("\n1: Take Lantern");
		System.out.println("\n2: Take Torch");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			lantern();
		} else if (choice == 2) {
			torch();
		} else {
			choicenotfound();
			door();
		}

	}

	/*
	 * Description about the wrong choice user have made.
	 */
	public void torch() {
		++moves;
		System.out.println("You don't have batteries, try to find another way");
		System.out.println("\n\nYour Moves " + moves);
		door();

	}

	/*
	 * Description about the clue to enter in to the next level and given chpoices
	 * to it.
	 */
	public void lantern() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a stair case on your left  ");
		System.out.println("\n1: Move forward");
		System.out.println("\n2: Move Left");
		System.out.println("\n3: Move Right");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			moveForward();
		} else if (choice == 2) {
			moveLeft();
		} else if (choice == 3) {
			moveRight();
		} else {
			choicenotfound();
			lantern();
		}
	}

	/*
	 * Message will be shown if the user make wrong choice.
	 */
	public void moveRight() {
		++moves;
		System.out.println("There is nothing here");
		System.out.println("\n\nYour Moves " + moves);
		lantern();

	}

	/*
	 * Message will be shown if the user make wrong choice.
	 */
	public void moveForward() {
		++moves;
		System.out.println("There is nothing here");
		System.out.println("\n\nYour Moves " + moves);
		lantern();

	}

	/*
	 * User enters in to the next level and the choice of paintings have given.
	 */
	public void moveLeft() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a stair case. You are at the first floor of the building  ");
		System.out.println("There are three paintings infront of you, correct pianting leads you to the next clue.");
		System.out.println("\n1: Turn LeftPainting");
		System.out.println("\n2: Turn RightPainting");
		System.out.println("\n3: Turn CentrePainting");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			leftPainting();
		} else if (choice == 2) {
			rightPainting();
		} else if (choice == 3) {
			centrePainting();
		} else {
			choicenotfound();
			moveLeft();
		}

	}

	/*
	 * Message is shown if the user select first wrong choice.
	 */
	public void leftPainting() {
		++moves;
		System.out.println("Theres nothing in me");
		System.out.println("\n\nYour Moves " + moves);
		moveLeft();
	}

	/*
	 * Message is shown if the user selects correct choice and user is given chance
	 * to enter in to the next room.
	 */
	public void rightPainting() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(
				"Congrats, You've found the Correct painting with key and there is a door behind the painting  ");
		System.out.println("\n1: Open Door");
		System.out.println("\n2: Use Key");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			openDoor();
		} else if (choice == 2) {
			useKeys();
		} else {
			choicenotfound();
			rightPainting();
		}

	}

	/*
	 * This is a connection to the next level using constructor.
	 */
	public void useKeys() {
		++moves;
		StageThree Stagethree = new StageThree(choice, moves);
		Stagethree.useKeys();
	}

	/*
	 * User has given a choice and should require a key to enter in to the next
	 * room. If the user chooses an option he'll returns to the previous level.
	 */
	public void openDoor() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You cannot open the door without the key, you can use the key which you've found  ");
		System.out.println("\n1: Use Key");
		System.out.println("\n2: Go Back");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			useKeys();
		} else if (choice == 2) {
			openDoor();
		} else {
			choicenotfound();
			openDoor();
		}

	}

	/*
	 * User has to walk 10ft in one direction to go to next room.
	 */
	public void centrePainting() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Walk in the direction where you can walk 10 feet");
		System.out.println("\n1:Walk Right");
		System.out.println("\n2: Walk Left");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			walkRight();
		} else if (choice == 2) {
			walkLeft();
		} else {
			choicenotfound();
			centrePainting();
		}

	}

	/*
	 * Message will be displayed if the user chooses wrong choice.
	 */
	public void walkLeft() {
		System.out.println("This way is not 10 feet long enough");
		centrePainting();

	}

	/*
	 * Allows user to walk to right painting.
	 */
	public void walkRight() {
		rightPainting();

	}

	@Override
	public void choiceNotFound() {
		// TODO Auto-generated method stub

	}

}
