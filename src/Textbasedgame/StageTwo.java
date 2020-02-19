package Textbasedgame;
import java.util.*;

public class StageTwo extends StageOne implements InterfaceOne,InterfaceTwo{
	

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
		System.out.println("3: Go Forward ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			right(moves);
		} else if (choice == 2) {
			left(moves);
		}else  if ( choice ==3){
			forward(moves);
		}else {
			choicenotfound();
			open(moves);
		}
	}
	@Override
	public void forward(int moves) {
		this.moves = ++moves;
		System.out.println("It's very dark in here you cannot move in dark, try to find light");
		System.out.println("\nYour Moves " + moves);
		open(moves);
	}
	@Override
	public void left(int moves) {
		this.moves = ++moves;
		System.out.println("There is a room in the corner  ");
		System.out.println("\nYour Moves " + moves);
		open(moves);
	}
	@Override
	public void right(int moves) {
		this.moves = ++moves;
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
			left(moves);
		} else {
			choicenotfound();
			right(moves);
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
		System.out.println("You don't have batteries, try to find another way");
		System.out.println("\nYour Moves " + moves);
		door();
		
	}

	public void lantern() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a stair case on your left  ");
		System.out.println("\n1: Move forward");
		System.out.println("\n2: Move Left");
		System.out.println("\n3: Move Right");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			moveForward();
		} else if (choice == 2) {
			moveLeft();
		} else if (choice ==3){
			moveRight();
		} else {
			choicenotfound();
			lantern();
		}
	}

	public void moveRight() {
		System.out.println("there is nothing here");
		lantern();
		
	}
	public void moveForward() {
		System.out.println("there is nothing here");
		lantern();
		
	}
	public void moveLeft() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a stair case. You are at the first floor of the building  ");
		System.out.println("There are three paintings infront of you , Find your way  ");
		System.out.println("\n1: Turn LeftPainting");
		System.out.println("\n2: Turn RightPainting");
		System.out.println("\n3: Turn CentrePainting");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			leftPainting();
		} else if (choice == 2) {
			rightPainting();
		} else if (choice ==3){
			centrePainting();
		} else {
			choicenotfound();
			moveLeft();
		}
		
		
		
	}

	public void leftPainting() {
		System.out.println("Theres nothing in me");
		moveLeft();
	}
	public void rightPainting() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Congrats, You've found the Correct painting with key and there is a door behind the painting  ");
		System.out.println("\n1: Open Door");
		System.out.println("2: Use Key");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			openDoor();
		} else if (choice == 2) {
			useKeys(moves);
		} else {
			choicenotfound();
			rightPainting();
		}
		
		
	}
	@Override
	public void useKeys(int moves) {
		this.moves = moves;
		StageThree Stagethree = new StageThree(choice,moves);
		Stagethree.useKeys(moves);
	}
		
		
		
	public void openDoor() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You cannot open the door without the key, you can use the key which you've found  ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		useKeys(moves);
		
		
	}
	public void centrePainting() {
		moves = ++moves;
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
