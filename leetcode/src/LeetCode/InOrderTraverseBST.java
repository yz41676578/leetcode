package LeetCode;

import java.util.Stack;

import DataStructure.Tree;

public class InOrderTraverseBST {
	static public void InOrderTraverse(Tree root) {
		
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(root);
		Tree prev = root;
		while(!stack.empty()) {
			Tree curr = stack.peek();
			if(curr.lc != null && (prev.lc == curr || prev.rc == curr || prev == curr)) {
				stack.push(curr.lc);
			}
			else {
				System.out.print(stack.pop().data + " ");
				if(curr.rc != null) {
					stack.push(curr.rc);
				}
			}
			prev = curr;
		}
	}
	
/**
 * Good way!
 * @param root
 */
static public void InOrderTraverse_Pro(Tree root) {
		
		Stack<Tree> stack = new Stack<Tree>();
		Tree curr = root;
		while(curr != null || !stack.empty()) {
			if(curr != null) {
				stack.push(curr);
				curr = curr.lc;
			}
			else {
				Tree tmp = stack.pop();
				System.out.print(tmp.data + " ");
				curr = tmp.rc;
			}
		}
	}
}
