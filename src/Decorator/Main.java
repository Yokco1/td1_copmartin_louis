package Decorator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What game do you want to play?");
		System.out.println("(1) --- More or Less ---");
		System.out.println("(2) --- Hot and Cold ---");
		int userInput = scanner.nextInt();
		
		switch(userInput) {
		case(1):
			MoreOrLess game = new MoreOrLess();
		
			System.out.println("Do you wish to play a time restricted version? [yes/no]");
			game.play();
		case(2):
			HotNCold game2 = new HotNCold();
		
			System.out.println("Do you wish to play a time restricted version? [yes/no]");
			
			game2.play();
		}
		
		scanner.close();
	}
}
