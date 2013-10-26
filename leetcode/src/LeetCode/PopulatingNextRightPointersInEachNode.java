package LeetCode;

public class PopulatingNextRightPointersInEachNode {
	public static class Node {
		public Node(int n) {
			data = n;
		}
		public int data;
		public Node lc;
		public Node rc;
		public Node nr;
	}
	
	public static void populateNextRight(Node root) {
		if(root == null)
			return;
		else {
			if(root.lc != null)
				root.lc.nr = root.rc;
			if(root.rc != null)
				root.rc.nr = (root.nr == null) ? null : root.nr.lc;
			populateNextRight(root.lc);
			populateNextRight(root.rc);
		}
	}
}
