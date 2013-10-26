package test;

import DataStructure.LinkedList;
import LeetCode.ReverseLinkedList;

public class ReverseLinkedListTest {
	public static void main(String[] args) {
		LinkedList node0 = new LinkedList(0);
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(3);
		LinkedList node4 = new LinkedList(4);
		LinkedList node5 = new LinkedList(5);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		for(LinkedList node = node0; node != null; node = node.next)
			System.out.print(node.data + " ");
		System.out.println();
		
		LinkedList newList = ReverseLinkedList.ReverseLinkedList_Iterate(node0);
		for(LinkedList node = newList; node != null; node = node.next)
			System.out.print(node.data + " ");
		System.out.println();
		LinkedList newList1 = ReverseLinkedList.ReverseLinkedList_Recursive(newList);
		for(LinkedList node = newList1; node != null; node = node.next)
			System.out.print(node.data + " ");
	}
}
