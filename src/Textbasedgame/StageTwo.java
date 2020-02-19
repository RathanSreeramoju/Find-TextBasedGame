package Textbasedgame;
import java.util.*;

public class StageTwo extends StageOne implements InterfaceOne{
	

	int choice;
	int moves;
	Scanner scanner= new Scanner( System.in);
	
	/*
	 * Level two starts from here
	 */

	public StageTwo(int choice,int moves) {
		super(choice, moves);
		this.moves = moves;
		open(moves);
	}
	public void open(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("you are at level two now");
		System.out.println("Building is completely dark and there is a box infront of you");
		System.out.println("1: Open box");
		System.out.println("2: Go back ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			box(moves);
		} else if (choice == 2) {
			open(moves);
		}else {
			choicenotfound();
			open(moves);
		}
		
	}
	
	public void choicenotfound() {
		System.out.println("Choice not found");
		
	}

	public void box(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You found a slip which indicates");
		System.out.println("\"Everyone will succeed in life if they do the things right \"");
		System.out.println("1: Go Right");
		System.out.println("2: Go left ");
		System.out.println("2: Go Forward ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			right();
		} else if (choice == 2) {
			left();
		}else  if ( choice ==3){
			forward(moves);
		}else {
			choicenotfound();
			open(moves);
		}
	}

	public void forward(int moves) {
		this.moves = ++moves;
		System.out.println("It's very dark in here you cannot move in dark, try to find light");
		System.out.println("\nYour Moves " + moves);
		open(moves);
	}

	public void left() {
		moves = ++moves;
		System.out.println("There is a room in the corner  ");
		System.out.println("\nYour Moves " + moves);
		open(moves);
	}

	public void right() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a room ");
		System.out.println("1: Open Door");
		System.out.println("2: Go left ");
		System.out.println("\nYour Moves " + moves);
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
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You found a Lantern and a torch on the table ");
		System.out.println("1: Take Lantern");
		System.out.println("2: Take Torch");
		System.out.println("\nYour Moves " + moves);
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
		moves = ++moves;
		System.out.println("\nYour Moves " + moves);
		
	}

	public void lantern() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a stair case on your left  ");
		System.out.println("1: Move forward");
		System.out.println("2: Move Left");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			moveForward();
		} else if (choice == 2) {
			moveLeft();
		} else {
			choicenotfound();
			lantern();
		}
	}

	public void moveLeft() {
		
		
	}

	public void moveForward() {
		
		
	}

	

}
