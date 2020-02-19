package Textbasedgame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

public class StageOne implements InterfaceOne{
	int choice;
	int moves;
	Scanner scanner = new Scanner(System.in);
	/* 
	 * Player details 
	 * 
	 */	
	public StageOne (int choice, int moves) {
		this.choice = choice;
		this.moves = moves;
	}
	
	public void playerSetup()  {
		
		System.out.println("Enter your name : ");
		String playerName= scanner.nextLine();
		System.out.println("Hello " +playerName+ " Welcome to FIND" );
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
	 */
	public void find() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You are infront of the Building facing south. There are four doors to the building,");
		System.out.println("But you have only one key to open one of the door among 4, you can see a mat under your foot ");
		System.out.println("1: Open mat");
		System.out.println("2: Go left ");
		System.out.println("3: Go right");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			mat(moves);
		} else if (choice == 2) {
			left(moves);
		} else if (choice == 3) {
			right(moves);
		}else {
			choicenotfound();
			find();
		}
	}
	
	public void mat(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You have a card and an axe.");
		System.out.println("\n1: Turn card ");
		System.out.println("\n2: Take axe");
		System.out.println("\nYour Moves: " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			read(moves);
		} else if (choice == 2){
			takeAxe(moves);
		}else {
			choicenotfound();
			mat(moves);
		}
	}
	@Override
	public void left(int moves) {
		System.out.println(" Its really dark here ,find a clue to open the door");
		find();
		
	}
	@Override
	public void right(int moves) {
		System.out.println("You have a window and its too dark in the house.");
		find();
	}
	
	public void read(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" Card says \"Direction of the first light.\"");
		System.out.println("\n1: Go east ");
		System.out.println("\n2: Go west");
		System.out.println("\n3: Go south");
		System.out.println(" Your Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east(moves);
		} else if (choice == 2){
			west(moves);
		}else if ( choice == 3){
			south(moves);
		}else {
			read(moves);
		}	
	}	
	
	public void breakDoor(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You cant break the door its too hard to break, try another way to open  ");
		System.out.println("\n1: Turn card ");
		System.out.println("\n2: Go back ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			read(moves);
		} else if (choice == 2){
			mat(moves);
		}else {
			choicenotfound();
			mat(moves);
		}
	}
	
	public void takeAxe(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You have an axe in your hand ");
		System.out.println("\n1: Break the door ");
		System.out.println("\n2: Leave the axe ");
		System.out.println(" Your Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			breakDoor(moves);
		} else if (choice == 2){
			leave();
		} else {
			choicenotfound();
			takeAxe(moves);
		} 
		
	}
	
	public void east(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You found the right door ");
		System.out.println("\n1: Open the door ");
		System.out.println("\n2: Go back ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			open(moves);
		} else if (choice == 2){
			read(moves);
		}else {
			choicenotfound();
			east(moves);
		}
		
	}
	
	public void west(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You are at the west door and you cannot open it ");
		System.out.println("\n1: GO to east door ");
		System.out.println("\n2: Go to south door ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east(moves);
		} else if (choice == 2){
			south(moves);
		}else {
			choicenotfound();
			west(moves);
		}
	}
	
	public void south(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You are at the south door and you dont have a key to open it ");
		System.out.println("\n1: GO to east door ");
		System.out.println("\n2: Go to west door ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east(moves);
		} else if (choice == 2){
			west(moves);
		}else {
			choicenotfound();
			south(moves);
		}
	}
	
	public void leave() {
		mat(moves);
		
	}
	public static Date StringToDate(String dob) throws ParseException {
	      //Instantiating the SimpleDateFormat class
	      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	      //Parsing the given String to Date object
	      Date date = formatter.parse(dob);
	      System.out.println("Date object value: "+date);
	      return date;
	   } 	
	
	public void choicenotfound() {
		System.out.println(" Choice not found");
	}

	public void open(int moves) {
		this.moves = ++moves;
		StageTwo Stagetwo = new StageTwo( choice, moves);
		Stagetwo.open(moves);
		
	}

	@Override
	public void forward(int moves) {
		// TODO Auto-generated method stub
		
	}

	public void useKeys(int moves) {
		// TODO Auto-generated method stub
		
	}
}
	

