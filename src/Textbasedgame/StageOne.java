package Textbasedgame;
import java.util.*;

public class StageOne extends StageTwo {
	int choice;
	int moves = 0;
	Scanner scanner = new Scanner(System.in);
	/* 
	 * Player details 
	 * 
	 */
	public void playerSetup() {
		
		System.out.println("Enter your name : ");
		String playerName= scanner.nextLine();
		System.out.println("Hello " +playerName+ " Welcome to FIND" );
		System.out.println("Age ");
		int age = scanner.nextInt();
		System.out.println("Gender ");
		char gender = scanner.next().charAt(0);
		System.out.println(" Your Moves " + moves);
	}
	/*
	 * Game starts from here 
	 */
	public void find() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You are infront of the Building facing south. There are four doors to the building,");
		System.out.println("But you have only one key to open one of the door among 4, you can see a mat under you ");
		System.out.println("1: Open mat");
		System.out.println("2: Go left ");
		System.out.println("3: Go right");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			mat();
		} else if (choice == 2) {
			left();
		} else if (choice == 3) {
			right();
		}else {
			choicenotfound();
		}
	}
	
	public void mat() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You have a card and an axe.");
		System.out.println("\n1: Turn card ");
		System.out.println("\n2: Take axe");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			Read();
		} else if (choice == 2){
			TakeAxe();
		}else {
			choicenotfound();
			mat();
		}
	}
	
	public void left() {
		System.out.println(" Its really dark here ,find a clue to open the door");
		find();
		
	}
	
	public void right() {
		System.out.println("You have a window and its too dark in the house.");
		find();
	}
	
	public void Read() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" Card says \"Direction of the first light.\"");
		System.out.println("\n1: Go east ");
		System.out.println("\n2: Go west");
		System.out.println("\n3: Go south");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east();
		} else if (choice == 2){
			west();
		}else if ( choice == 3){
			south();
		}else {
			Read();
		}
	}
	
	public void TakeAxe() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You have an axe in your hand ");
		System.out.println("\n1: Break the door ");
		System.out.println("\n2: Leave the axe ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			Break();
		} else if (choice == 2){
			Leave();
		} else {
			choicenotfound();
			TakeAxe();
		} 
		
	}
	
	public void east() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You found the right door ");
		System.out.println("\n1: Open the door ");
		System.out.println("\n2: Go back ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			open();
		} else if (choice == 2){
			Read();
		}else {
			choicenotfound();
			east();
		}
		
	}
	
	public void west() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You are at the west door and you cannot open it ");
		System.out.println("\n1: GO to east door ");
		System.out.println("\n2: Go to south door ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east();
		} else if (choice == 2){
			south();
		}else {
			choicenotfound();
			west();
		}
	}
	
	public void south() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You are at the south door and you dont have a key to open it ");
		System.out.println("\n1: GO to east door ");
		System.out.println("\n2: Go to west door ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			east();
		} else if (choice == 2){
			west();
		}else {
			choicenotfound();
			south();
		}
	}
	
	public void Break() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println(" You cant break the door its too hard to break, try another way to open  ");
		System.out.println("\n1: Turn card ");
		System.out.println("\n2: Go back ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			Read();
		} else if (choice == 2){
			mat();
		}else {
			choicenotfound();
			mat();
		}
	}
	
	public void Leave() {
		mat();
		
	}
	
	public void move() {
		moves++;
		System.out.println("Your Moves: "+ moves);
	}

}
	

