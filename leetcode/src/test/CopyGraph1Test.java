package test;

import DataStructure.GraphNode;
import LeetCode.CopyGraph1;

public class CopyGraph1Test {
	public static void main(String[] args) {
		GraphNode a = new GraphNode(1);
		GraphNode b = new GraphNode(2);
		GraphNode c = new GraphNode(3);
		GraphNode d = new GraphNode(4);
		GraphNode e = new GraphNode(5);
		a.list.add(b);
		a.list.add(c);
		a.list.add(d);
		b.list.add(e);
		c.list.add(e);
		d.list.add(e);
		
		
		GraphNode cp = CopyGraph1.copyGraphBFS(a);
	}
}
