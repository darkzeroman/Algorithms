/**
 * 
 */
package searches;

import java.util.LinkedList;

/**
 * @author dkz
 * 
 */
public class BFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = BST.makeTree(new int[] { 10, 12, 8, 9, 7, 11, 13 });
		printBFT(root);
		System.out.println("Looking for 10, found? :" + find(root, 10));

	}

	public static void printBFT(Node root) {
		Node sentinel = new Node();
		LinkedList<Node> queue = new LinkedList<Node>();// Queue to hold nodes
		queue.add(sentinel);
		queue.push(root);

		while (!queue.isEmpty()) {
			Node currNode = queue.pop();
			if (currNode == sentinel) {
				if (!queue.isEmpty()) {
					queue.add(sentinel);
					System.out.print("| ");
				} else
					System.out.println();
			} else
				System.out.print(currNode.intData + " ");

			if (currNode.left != null)
				queue.add(currNode.left);
			if (currNode.right != null)
				queue.add(currNode.right);
		}

	}

	public static boolean find(Node root, int num) {
		LinkedList<Node> queue = new LinkedList<Node>();// Queue to hold nodes
		queue.push(root);

		while (!queue.isEmpty()) {
			Node currNode = queue.pop();
			if (currNode.intData == num)
				return true;
			if (currNode.left != null)
				queue.addLast(currNode.left);
			if (currNode.right != null)
				queue.addLast(currNode.right);
		}
		return false;

	}
}
