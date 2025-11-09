package Composite;

import java.util.HashMap;
import java.util.Map;

public class Operation {
	private final static Map<String, Operation> myOps;
	static {
		myOps = new HashMap<>();
		myOps.put("+", new Operation("+"));
		myOps.put("-", new Operation("-"));
		myOps.put("*", new Operation("*"));
		myOps.put("/", new Operation("/"));
	}

	private String opName;

	public int evaluation(int v1, int v2) {
		switch(this.opName) {
		case("+"):
			return v1+v2;
		case("-"):
			return v1-v2;
		case("*"):
			return v1*v2;
		case("/"):
			return v1/v2;
		default:
			return -1;
		}
	}

	public static Operation getInstance(String s) {
		return myOps.get(s);
	}

	private Operation(String s) { opName = s;}
}
