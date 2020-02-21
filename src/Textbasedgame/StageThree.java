package Textbasedgame;

import java.util.Scanner;

public class StageThree extends StageOne implements InterfaceOne, InterfaceTwo {
	String password;
	Scanner scanner = new Scanner(System.in);

	public StageThree(int choice, int moves) {
		super(choice, moves);

	}

	/*
	 * user moved to the next room and has given choices again. User requires
	 * certain clues to find the next clue.
	 */
	public void useKeys() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You've unlocked the door, there is a table with 2 drawers in it and a computer  ");
		System.out.println("\n1: Open Drawer1");
		System.out.println("\n2: Open Drawer2");
		System.out.println("\n3: Turn On Computer");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			openDrawer1();
		} else if (choice == 2) {
			openDrawer2();
		} else if (choice == 3) {
			turnOnComputer();
		} else {
			choiceNotFound();
			useKeys();
		}

	}

	/*
	 * Lets user to turn on the computer and the message will be popped up if he
	 * don't have password.
	 */
	public void turnOnComputer() {
		++moves;
		System.out.println("You need a password to access the computer");
		System.out.println("\n\nYour Moves " + moves);
		useKeys();

	}

	/*
	 * Lets user to open the Drawer1 and message is displayed.
	 */
	public void openDrawer1() {
		++moves;
		System.out.println("This drawer contains some papers that of no use.");
		System.out.println("\n\nYour Moves " + moves);
		useKeys();

	}

	/*
	 * Lets user to open Drawer2 and message will be shown
	 */
	public void openDrawer2() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You have a slip with a riddle on it  ");
		System.out.println("\n1:Read Slip ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			readSlip();
		} else {
			choiceNotFound();
			openDrawer2();
		}

	}

	/*
	 * Lets user to read the message/hint to the password of the computer.
	 */
	public void readSlip() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("What is greater than God, worst than Evil, poor people have it, the rich require it ");
		System.out.println("and if you eat it you die ?");
		System.out.println("\n1: Read Hint");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			readHint();
		} else {
			choiceNotFound();
			readSlip();
		}

	}

	/*
	 * Hint is displayed and choices have been provided to the user.
	 */
	public void readHint() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" 14 15 20 8 9 14 7 ");
		System.out.println("\n1: Anything");
		System.out.println("\n2: Something");
		System.out.println("\n3: Nothing");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			anything();
		} else if (choice == 2) {
			something();
		} else if (choice == 3) {
			nothing();
		} else {
			choiceNotFound();
			readSlip();
		}

	}

	/*
	 * Message will be shown if the user selects the wrong choice.
	 */
	public void anything() {
		++moves;
		System.out.println("You have chosen wrong password");
		System.out.println("\n\nYour Moves " + moves);
		readHint();

	}

	/*
	 * Message will be shown if the user selects the wrong choice.
	 */
	public void something() {
		++moves;
		System.out.println("You have chosen wrong password");
		System.out.println("\n\nYour Moves " + moves);
		readHint();

	}

	/*
	 * Message will be shown if the user selects the correct choice and the game
	 * ends here.
	 */
	public void nothing() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("The PC is turned On and there is a map on desktop with marked location. ");
		System.out.println(" Congratulations you finished the game successfully with the given hints");
		System.out.println("\n\n-------------------------*Game Over*-----------------------");
		System.out.println("\n\nTotal Moves : " + moves);
		System.out.println("\n------------------------------------------------------------------");
	}

	@Override
	public void choiceNotFound() {
		System.out.println("Choice not found");

	}

}
