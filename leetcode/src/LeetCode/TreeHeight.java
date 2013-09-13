package LeetCode;
import java.util.Stack;

import DataStructure.Tree;


public class TreeHeight {
	static public int getHeight(Tree root ) {
		if(root == null)
			return 0;
		int lh = getHeight(root.lc);
		int rh = getHeight(root.rc);
		return lh >= rh ? (lh+1):(rh+1);
 	}
	
	static public int getHeightDFS(Tree root) {
		if(root == null) 
			return 0;
		int height = 0;
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(root);
		Tree prev = root;
		while(!stack.empty()) {
			if(stack.size() > height)
				height = stack.size();
			Tree curr = stack.peek();
			if(curr.lc != null && curr.lc != prev && curr.rc != prev) {
				stack.push(curr.lc);
				prev = curr;
				continue;
			}
			if(curr.rc != null && curr.rc != prev) {
				stack.push(curr.rc);
				prev = curr;
				continue;
			}
			stack.pop();
			prev = curr;
		}
		return height;
	}
	
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
		
		System.out.println(getHeight(tree0));
		System.out.println(getHeightDFS(tree0));
	}
}
