/**
 * 
 */
package searches;

/**
 * @author dkz
 * 
 */
public class BST {
	enum Traverse {
		Preorder, Inorder, Postorder
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = makeTree(new int[] { 10, 12, 8, 9, 7, 11, 13 });
		printTree(root, Traverse.Preorder);
		printTree(root, Traverse.Inorder);
		printTree(root, Traverse.Postorder);

	}

	public static Node makeTree(int[] arr) {
		Node root = new Node(arr[0]);
		for (int i = 1; i < arr.length; i++)
			insertNode(root, arr[i]);
		return root;
	}

	public static void printTree(Node root, Traverse order) {
		printTreeHelper(root, order);
		System.out.println();
	}

	public static void printTreeHelper(Node root, Traverse order) {
		if (root == null) {
			return;
		}
		if (order == Traverse.Preorder) {
			System.out.print(root.intData + " ");
			printTreeHelper(root.left, order);
			printTreeHelper(root.right, order);
		}
		if (order == Traverse.Inorder) {
			printTreeHelper(root.left, order);
			System.out.print(root.intData + " ");
			printTreeHelper(root.right, order);
		}
		if (order == Traverse.Postorder) {
			printTreeHelper(root.left, order);
			printTreeHelper(root.right, order);
			System.out.print(root.intData + " ");

		}

	}

	public static void insertNode(Node node, int num) {
		if (node == null)
			node = new Node(num);
		if (num < node.intData) {
			if (node.left == null)
				node.left = new Node(num);
			else
				insertNode(node.left, num);
		} else {
			if (node.right == null)
				node.right = new Node(num);
			else
				insertNode(node.right, num);

		}
	}
}
