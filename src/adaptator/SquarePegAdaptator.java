package adaptator;

public class SquarePegAdaptator implements IAdaptator{
	
	double size;
	
	public SquarePegAdaptator(SquarePeg s) {
		size = squareToHole(s);
	}

	private double squareToHole(SquarePeg s) {
		return Math.sqrt(2)*s.size;
	}
	
	@Override
	public double getDiag() {
		return size;
	}
}
