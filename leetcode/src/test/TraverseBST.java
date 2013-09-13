package test;

import DataStructure.Tree;
import LeetCode.InOrderTraverseBST;

public class TraverseBST {
	public static void main(String[] args) {
		Tree tree0 = new Tree(0);
		Tree tree1 = new Tree(1);
		Tree tree2 = new Tree(2);
		Tree tree3 = new Tree(3);
		Tree tree4 = new Tree(4);
		Tree tree5 = new Tree(5);
		Tree tree6 = new Tree(6);
		Tree tree7 = new Tree(7);
		Tree tree8 = new Tree(8);
		
		tree0.lc = tree1;
		tree0.rc = tree2;
		tree1.lc = tree3;
		tree1.rc = tree4;
		tree2.lc = tree5;
		tree2.rc = tree6;
		tree4.lc = tree7;
		tree7.rc = tree8;
		
		InOrderTraverseBST.InOrderTraverse(tree0);
		System.out.println("");
		InOrderTraverseBST.InOrderTraverse_Pro(tree0);
	}
}
