package test;

import LeetCode.PopulatingNextRightPointersInEachNode;
import LeetCode.PopulatingNextRightPointersInEachNode.Node;

public class PopulateNextRightTest {
	public static void main(String[] args) {
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node12 = new Node(12);
		Node node13 = new Node(13);
		Node node14 = new Node(14);
		
		node0.lc = node1;
		node0.rc = node2;
		node1.lc = node3;
		node1.rc = node4;
		node2.lc = node5;
		node2.rc = node6;
		node3.lc = node7;
		node3.rc = node8;
		node4.lc = node9;
		node4.rc = node10;
		node5.lc = node11;
		node5.rc = node12;
		node6.lc = node13;
		node6.rc = node14;
		
		PopulatingNextRightPointersInEachNode.populateNextRight(node0);
		Node node;
		node = node1;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.nr;
		}
		System.out.print("\n");
		node = node3;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.nr;
		}
		System.out.print("\n");
		node = node7;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.nr;
		}
	}
}
