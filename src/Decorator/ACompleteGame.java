package Decorator;

public abstract class ACompleteGame implements ICompleteGame {
	public abstract void test(int n);
	public abstract String getMessage();
	public abstract boolean isWin();
	public abstract void generateWinningNumber();
}