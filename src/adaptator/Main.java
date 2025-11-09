package adaptator;

public class Main {
	
	public static void main(String[]args) {

		RoundHole hole = new RoundHole(3);

		SquarePeg peg1 = new SquarePeg(2);

		System.out.println("DOes a 2cm wide square peg fit in a 3cm wide round hole ?" + (hole.canFit(new SquarePegAdaptator(peg1)) ? "yes" : "no"));

		SquarePeg peg2 = new SquarePeg(3);

		System.out.println("Does a 3 cm wide squre peg fit in a 3cm wide round hole ?" + (hole.canFit(new SquarePegAdaptator(peg2)) ? "yes" : "no"));

 }
}

