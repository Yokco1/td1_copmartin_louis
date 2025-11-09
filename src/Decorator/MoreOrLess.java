package Decorator;

public class MoreOrLess implements ICompleteGame {
	
	int winningNumber = 0;

	@Override
	public void test(int n) {
		if(n < winningNumber) {
			System.out.println( n + "is lower than the mystery number");
		} else if(n > winningNumber) {
			System.out.println(n + "is higher than the mystery number");
		}
	}

	@Override
	public String getMessage() {
		return null;
	}

	@Override
	public boolean won() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
