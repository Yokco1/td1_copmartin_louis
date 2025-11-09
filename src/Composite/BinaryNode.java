package Composite;

public class BinaryNode implements INode {

	INode node1;
	INode node2;
	Operation op;
	
	public BinaryNode(INode nodeA, INode nodeB, Operation binOp) {
		node1 = nodeA;
		node2 = nodeB;
		op = binOp;
	}
	
	private BinaryNode() {}
	
	@Override
	public int evaluation() {
		return op.evaluation(node1.evaluation(), node2.evaluation());
	}

	
}
