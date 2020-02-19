package Textbasedgame;

import java.util.Scanner;

public class StageThree extends StageTwo implements InterfaceTwo{
	
	Scanner scanner = new Scanner(System.in);

	public StageThree(int choice, int moves) {
		super(choice,moves);
		this.moves = moves;
		useKeys(moves);
	}
	@Override
	public void useKeys(int moves) {
		this.moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You've unlocked the door, there is a tanble with 2 drawers in it  ");
		System.out.println("\n1: Open Drawer1");
		System.out.println("2: Open Drawer2");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			openDrawer1();
		} else if (choice == 2) {
			openDrawer2();
		}  else {
			choiceNotFound();
			useKeys(moves);
		}
		
	}
	public void openDrawer1() {

		System.out.println("This drawer contains some papers that of no use ");
		useKeys(moves);
		
		
	}
	public void openDrawer2() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You have two slips   ");
		System.out.println("\n1:Read Slip1 ");
		System.out.println("2: Read Slip2");
		System.out.println("3: Open Drawer1");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			readSlip1();
		} else if (choice == 2) {
			readSlip2();
		} else if (choice ==3){
			openDrawer1();
		} else {
		
			choiceNotFound();
			openDrawer2();
		}
		
		
	}
	
	public void readSlip1() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Slip 1 states that    ");
		System.out.println("\n1:Turn On  ");
		System.out.println("2: Read Slip2");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			turnOn();
		} else if (choice == 2) {
			readSlip2();
		} else {
			choiceNotFound();
			openDrawer2();
		}
		
		
	}
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	public void readSlip2() {
		moves = ++moves;
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Slip  2 has the riddle    ");
		System.out.println("\n1:Use Password  ");
		System.out.println("2: ");
		System.out.println("\nYour Moves " + moves);
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			usePassword();
		} else if (choice == 2) {
			readSlip2();
		} else {
			choiceNotFound();
			readSlip2();
		}
		
	}

	

	public void usePassword() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceNotFound() {
		System.out.println("");
		
		
	}
	
	

}
