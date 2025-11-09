package Decorator;
import java.util.Random;
import java.util.Scanner;

public class MoreOrLess implements ICompleteGame {
	
	private int winningNumber = 0;
	boolean won;
	private String winningMessage;
	private Random random = new Random();

	public void main() {
		Scanner scanner = new Scanner(System.in);
		
		won = false;
		
		while(won == false) {
			System.out.println("Enter a number :");
			int userInput = scanner.nextInt();
			test(userInput);
		}
		scanner.close();
	}
	
	private void generateWinningNumber() {
		winningNumber = random.nextInt(1000) + 1;
	}
	
	@Override
	public void test(int n) {
		if(n < winningNumber) {
			setMessage(n + "is lower than the mystery number");
		} else if(n > winningNumber) {
			setMessage(n + "is higher than the mystery number");
		} else if(n == winningNumber) {
			setMessage("gg");
		}
	}

	private void setMessage(String message) {
		winningMessage = message;
		System.out.println(getMessage());
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
