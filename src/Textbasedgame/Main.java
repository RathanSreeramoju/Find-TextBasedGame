package Textbasedgame;

public class Main {

	static int moves=0;
	public static void main(String[] args) {

		StageOne find = new StageOne(0, 0);
		find.playerSetup();
		find.find();

	}

}
