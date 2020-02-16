package Textbasedgame;
import java.util.*;

public class StageTwo extends StageThree{
	int choice;
	
	Scanner scanner= new Scanner( System.in);
	public void open() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("you are at level two now");
		System.out.println("Building is completely dark and there is box infront of you");
		System.out.println("1: Open box");
		System.out.println("2: Go back ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			box();
		} else if (choice == 2) {
			open();
		}else {
			choicenotfound();
			open();
		}
	}
	
	public void box() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You found a slip which indicates");
		System.out.println("\"Everyone will succeed in life if they do the things right \"");
		System.out.println("1: Go Right");
		System.out.println("2: Go left ");
		System.out.println("2: Go Forward ");
		System.out.println("\n------------------------------------------------------------------");
		choice = scanner.nextInt();
		if (choice == 1) {
			right();
		} else if (choice == 2) {
			left();
		}else  if ( choice ==3){
			forward();
		}else {
			choicenotfound();
			open();
		}
	}

	public void forward() {
		
		
	}

	public void left() {
		// TODO Auto-generated method stub
		
	}

	public void right() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("There is a room ");
		System.out.println("1: Open Door");
		System.out.println("2: Go left ");
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
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("You foound a Lantern and a torch on the table ");
		System.out.println("1: Take Lantern");
		System.out.println("2: Take Torch");
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
		// TODO Auto-generated method stub
		
	}

	public void lantern() {
		// TODO Auto-generated method stub
		
	}

}
