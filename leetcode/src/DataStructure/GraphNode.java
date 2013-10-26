package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	int number;
	public List<GraphNode> list = new ArrayList<GraphNode>();
	
	public GraphNode() {
		
	}
	
	public GraphNode(int n) {
		number = n;
	}
}
