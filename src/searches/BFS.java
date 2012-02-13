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
		search(root, 13);

	}

	public static void search(Node root, int num) {
		Node sentinel = new Node(1000);
		// Queue to hold nodes
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(sentinel);
		queue.push(root);

		while (queue.size() > 0) {
			Node currNode = queue.pop();
			if (currNode == sentinel) {
				if (queue.size() > 0) {
					queue.addLast(sentinel);
					System.out.println();
				}
			}

			else
				System.out.print(currNode.intData + " ");

			// if (currNode.intData == num)
			// System.out.println("found it!");
			if (currNode.left != null)
				queue.addLast(currNode.left);
			if (currNode.right != null)
				queue.addLast(currNode.right);
		}

	}
}
