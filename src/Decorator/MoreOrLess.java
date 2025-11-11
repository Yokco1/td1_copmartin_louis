package Decorator;
import java.util.Random;
import java.util.Scanner;

public class MoreOrLess extends ACompleteGame {
	
	private int winningNumber;
	private boolean won;
	private String winningMessage;
	private Random random = new Random();

	public void play() {
		Scanner scanner = new Scanner(System.in);
		
		won = false;
		generateWinningNumber();
		
		while(isWin()) {
			System.out.println("------------------------------------");
			System.out.println("Make a guess :");
			int userInput = scanner.nextInt();
			test(userInput);
			System.out.println(getMessage());
		}
		scanner.close();
	}
	
	public void generateWinningNumber() {
		winningNumber = random.nextInt(1000) + 1;
	}
	
	@Override
	public void test(int n) {
		if(n < winningNumber) {
			setMessage(n + " is lower than the mystery number");
		} else if(n > winningNumber) {
			setMessage(n + " is higher than the mystery number");
		} else if(n == winningNumber) {
			setMessage("gg");
			won = true;
		}
	}

	private void setMessage(String message) {
		winningMessage = message;
	}
	
	@Override
	public String getMessage() {
		return winningMessage;
	}

	@Override
	public boolean isWin() {
		return won;
	}
	
}
