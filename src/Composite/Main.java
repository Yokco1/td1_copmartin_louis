package Composite;

public class Main {
	public static void main(String[] args) {
		System.out.println("(2+4)/3+8");
		INode res = new BinaryNode(
				new BinaryNode(new BinaryNode(new IntegerNode(2), new IntegerNode(4), Operation.getInstance("+")),
						new IntegerNode(3), Operation.getInstance("/")),
				new IntegerNode(8), Operation.getInstance("+"));
		System.out.println("result : " + res.evaluation());
		
		System.out.println("(3*4)-(6/7)");
		INode res2 = new BinaryNode(
						new BinaryNode(new IntegerNode(3),new IntegerNode(4), Operation.getInstance("*")),
						new BinaryNode(new IntegerNode(6),new IntegerNode(7), Operation.getInstance("/")),
						Operation.getInstance("-"));
		System.out.println("result : " + res2.evaluation());
	}
}
