//Copmartin Louis S3B
package Composite;

public class IntegerNode implements INode{
	
	private final int value;

	@Override
	public int evaluation() {
		return value;
	}
	
	public IntegerNode(int value) {
		this.value = value;
	}
	
}
