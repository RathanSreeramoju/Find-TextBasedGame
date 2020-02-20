package Textbasedgame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

public class StageOne implements InterfaceOne {
	int choice;
	int moves;
	Scanner scanner = new Scanner(System.in);

	/*
	 * 
	 * 
	 */
	public StageOne(int choice, int moves) {
		this.choice = choice;
		this.moves = moves;
	}

	/*
	 * Playersetup contains name, age, gender and date of birth Moves attribute
	 * prints the moves that palyer uses
	 */
	public void playerSetup() {

		System.out.println("Enter your name : ");
		String playerName = scanner.nextLine();
		System.out.println("Hello " + playerName + " Welcome to FIND");
		System.out.println("Age ");
		int age = scanner.nextInt();
		System.out.println("Gender ");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter your date of birth (dd-MM-yyyy): ");
		String dob = scanner.next();
		try {
			Date date = StringToDate(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nYour Moves " + moves);
	}

	/*
	 * Game starts from here
	 * 
	 */
	public void find() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You are infront of the Building facing south. There are four doors to the building,");
		System.out.println(
				"But you have only one key to open one of the door among 4, you can see a mat under your foot ");
		System.out.println("1: Open mat");
		System.out.println("2: Go left ");
		System.out.println("3: Go right");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			mat();
		} else if (choice == 2) {
			left();
		} else if (choice == 3) {
			right();
		} else {
			choicenotfound();
			find();
		}
	}

	/*
	 * This method gives the option to choose card or axe to go to next step
	 * 
	 * @param moves will counted for every move
	 */
	public void mat() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You have a card and an axe.");
		// choose any of the option for hint
		System.out.println("\n1: Turn card ");
		System.out.println("\n2: Take axe");
		System.out.println("\n\nYour Moves: " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			read();
		} else if (choice == 2) {
			takeAxe();
		} else {
			choicenotfound();
			mat();
		}
	}

	/*
	 * method override from InterfaceOne It prints to find a clue to go to next step
	 */
	@Override
	public void left() {
		++moves;
		System.out.println(" Its really dark here ,find a clue to open the door");
		System.out.println("\n\nYour Moves: " + moves);
		find();

	}

	@Override
	public void right() {
		++moves;
		System.out.println("You have a window and its too dark in the house.");
		System.out.println("\n\nYour Moves: " + moves);
		find();
	}

	/*
	 * This method gives a hint to find the right door
	 * 
	 * @param moves will be calculate for every move
	 */
	public void read() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" Card says \"Direction of the first light.\"");
		System.out.println("\n1: Go east ");
		System.out.println("\n2: Go west");
		System.out.println("\n3: Go south");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east();
		} else if (choice == 2) {
			west();
		} else if (choice == 3) {
			south();
		} else {
			read();
		}
	}

	/*
	 * This method states to find an other way to open the door
	 * 
	 * @param moves will be calculated
	 */
	public void breakDoor() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You cant break the door its too hard to break, try another way to open  ");
		System.out.println("\n1: Turn card ");
		System.out.println("\n2: Go back ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			read();
		} else if (choice == 2) {
			mat();
		} else {
			choicenotfound();
			mat();
		}
	}

	/*
	 * This method
	 */
	public void takeAxe() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You have an axe in your hand ");
		System.out.println("\n1: Break the door ");
		System.out.println("\n2: Leave the axe ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			breakDoor();
		} else if (choice == 2) {
			leave();
		} else {
			choicenotfound();
			takeAxe();
		}

	}

	public void east() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You found the right door ");
		System.out.println("\n1: Open the door ");
		System.out.println("\n2: Go back ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			open();
		} else if (choice == 2) {
			read();
		} else {
			choicenotfound();
			east();
		}

	}

	public void west() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You are at the west door and you cannot open it ");
		System.out.println("\n1: GO to east door ");
		System.out.println("\n2: Go to south door ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east();
		} else if (choice == 2) {
			south();
		} else {
			choicenotfound();
			west();
		}
	}

	public void south() {
		++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You are at the south door and you dont have a key to open it ");
		System.out.println("\n1: GO to east door ");
		System.out.println("\n2: Go to west door ");
		System.out.println("\n\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east();
		} else if (choice == 2) {
			west();
		} else {
			choicenotfound();
			south();
		}
	}

	public void leave() {
		mat();

	}

	public static Date StringToDate(String dob) throws ParseException {
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date = formatter.parse(dob);
		System.out.println("Date object value: " + date);
		return date;
	}
	

	public void choicenotfound() {
		System.out.println(" Choice not found");
	}

	public void open() {
		++moves;
		StageTwo Stagetwo = new StageTwo(choice, moves);
		Stagetwo.open();

	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub

	}

	public void useKeys() {
		// TODO Auto-generated method stub

	}
}
