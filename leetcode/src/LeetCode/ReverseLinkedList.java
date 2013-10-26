package LeetCode;

import DataStructure.LinkedList;

public class ReverseLinkedList {
	
	public static LinkedList ReverseLinkedList_Iterate(LinkedList head) {
		LinkedList prev = null;
		LinkedList curr = head;
		while(curr != null) {
			LinkedList next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static LinkedList ReverseLinkedList_Recursive(LinkedList head) {
		if(head == null)
			return null;
		else {
			LinkedList p = head.next;
			LinkedList rest = ReverseLinkedList_Recursive(p);
			if(rest == null)
				return head;
			else {
				p.next = head;
				head.next = null;
				return rest;
			}
		}
	}
}
