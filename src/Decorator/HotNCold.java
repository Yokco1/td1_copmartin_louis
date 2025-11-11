package Decorator;

import java.util.Scanner;
import java.util.Random;

public class HotNCold implements ICompleteGame {
	
	HotNCold(){
		lastPick = -1;
	}

	int lastPick;
	private boolean won;
	private String winningMessage;
	private int winningNumber;
	private Random random = new Random();
	
	public void play() {
		Scanner scanner = new Scanner(System.in);
		
		won = false;
		generateWinningNumber();
		lastPick = -1;
		
		System.out.println("------------------------------------");
		System.out.println("Choose your base number : ");
		int userInput = scanner.nextInt();
		test(userInput);
		
		while(!isWin()) {
			System.out.println("------------------------------------");
			System.out.println("Make a guess : ");
			userInput = scanner.nextInt();
			test(userInput);
			System.out.println(getMessage());
			}
		scanner.close();
	}
	
	@Override
	public void test(int n) {
		while(winningNumber == n && lastPick == -1) {
			generateWinningNumber();
		}
		if(winningNumber == n) {
			setMessage("You won!!! The winning number was indeed " + n);
			won = true;
		}else if(lastPick == -1) {
			setMessage(n + " is your base number");
		}  else if(Math.abs(winningNumber - n) > Math.abs(winningNumber - lastPick)) {
			setMessage("Cold: " + n + " isn't closer than " + lastPick + " to the winning number");
		} else if(Math.abs(winningNumber - n) < Math.abs(winningNumber - lastPick)){
			setMessage("Hot: " + n + " is closer than " + lastPick + " to the winning number");
		}
		lastPick = n;
	}

	@Override
	public String getMessage() {
		return winningMessage;
	}

	@Override
	public boolean isWin() {
		return won;
	}
	
	private void setMessage(String message) {
		winningMessage = message;
	}

	public void generateWinningNumber() {
		winningNumber = random.nextInt(1000) + 1;
	}
}
