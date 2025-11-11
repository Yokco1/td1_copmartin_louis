package Decorator;

import java.util.Scanner;

public class TimedGame extends ATimedGame {
	
	int lastPick;
	private ICompleteGame game;
	private int triesLeft;

	TimedGame(ACompleteGame game) {
		super(game);
		this.game = game;
	}
	
	public void play() {
		triesLeft = 11;
		
		Scanner scanner = new Scanner(System.in);
		game.generateWinningNumber();
		
		while(game.isWin() && Timer()) {
			System.out.println("------------------------------------");
			System.out.println("Make a guess :");
			int userInput = scanner.nextInt();
			game.test(userInput);
			System.out.println(game.getMessage());
		}
		scanner.close();
	}

	@Override
	public boolean Timer() {
		 triesLeft -= 1;
		 if(triesLeft >= 0) {
			 System.out.println("You lost. womp womp");
			 return false;
		 } else {
			 System.out.println("You have " + triesLeft + " tries.");
			 return true;
		 }
	}
	

}
