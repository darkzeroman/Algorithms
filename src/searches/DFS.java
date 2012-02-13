/**
 * 
 */
package searches;

import java.util.LinkedList;

/**
 * @author 01
 * 
 */
public class DFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = BST.makeTree(new int[] { 10, 12, 8, 9, 7, 11, 13 });
		printDFT(root);
		find(root, 14);

	}

	public static void printDFT(Node root) {
		LinkedList<Node> stack = new LinkedList<Node>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node currNode = stack.pop();

			System.out.println(currNode.intData);

			if (currNode.right != null)
				stack.push(currNode.right);
			if (currNode.left != null)
				stack.push(currNode.left);

		}
	}

	public static boolean find(Node root, int num) {
		LinkedList<Node> stack = new LinkedList<Node>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node currNode = stack.pop();

			if (num == currNode.intData)
				return true;
			if (currNode.right != null)
				stack.push(currNode.right);
			if (currNode.left != null)
				stack.push(currNode.left);
		}
		return false;
	}

}
