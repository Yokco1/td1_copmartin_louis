package adaptator;

public class RoundHole {

	double size;
	
	public RoundHole(double s) {
		size = s;
	}
	
	public boolean canFit(IAdaptator s) {
		return s.getDiag() <= size;
	}
}
