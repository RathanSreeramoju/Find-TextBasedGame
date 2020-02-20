package Textbasedgame;

import java.util.*;

public class StageTwo extends StageOne implements InterfaceOne, InterfaceTwo {

	int choice;
	int moves;
	Scanner scanner = new Scanner(System.in);

	/*
	 * Level two starts from here
	 */

	public StageTwo(int choice, int moves) {
		super(choice, moves);
	}

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

	public void choicenotfound() {
		System.out.println("Choice not found");

	}

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
		System.out.println("There is a room in the corner  ");
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

	public void door() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You found a Lantern and a torch on the table ");
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

	public void torch() {
		++moves;
		System.out.println("You don't have batteries, try to find another way");
		System.out.println("\n\nYour Moves " + moves);
		door();

	}

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

	public void moveRight() {
		++moves;
		System.out.println("there is nothing here");
		System.out.println("\n\nYour Moves " + moves);
		lantern();

	}

	public void moveForward() {
		++moves;
		System.out.println("there is nothing here");
		System.out.println("\n\nYour Moves " + moves);
		lantern();

	}

	public void moveLeft() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a stair case. You are at the first floor of the building  ");
		System.out.println("There are three paintings infront of you , Find your way  ");
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

	public void leftPainting() {
		++moves;
		System.out.println("Theres nothing in me");
		System.out.println("\n\nYour Moves " + moves);
		moveLeft();
	}

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

	@Override
	public void useKeys() {
		++moves;
		StageThree Stagethree = new StageThree(choice, moves);
		Stagethree.useKeys();
	}

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

	public void centrePainting() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You find the way when you see 10feet from you  ");
		System.out.println("\n1:Walk Right");
		System.out.println("2: Walk Left");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			walkLeft();
		} else if (choice == 2) {
			walkRight();
		} else {
			choicenotfound();
			centrePainting();
		}

	}

	public void walkLeft() {
		System.out.println("This way is not 10 feet long enough");
		centrePainting();

	}

	public void walkRight() {
		rightPainting();

	}

	@Override
	public void choiceNotFound() {
		// TODO Auto-generated method stub

	}

}
