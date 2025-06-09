package javaprograms;

public class AvlTree {
	class Node {
		int key;
		int height;
		Node left, right;

		public Node(int value) {
			key = value;
			height = 1;
		}
	}

	Node root;

	int height(Node n) {
		if (n == null) {
			return 0;
		}
		return n.height;
	}

	int getBalance(Node n) {
		if (n == null) {
			return 0;
		}
		return height(n.left) - height(n.right);
	}

	Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;

		// Perform rotation
		x.right = y;
		y.left = t2;

		// Update heights
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		// Return new root
		return x;
	}

	Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;

		// Perform rotation
		y.left = x;
		x.right = t2;

		// Update heights
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		// Return new root
		return y;
	}

	Node Insert(Node node, int key) {
		// Normal BST insertion
		if (node == null) {
			return new Node(key);
		}

		if (key < node.key) {
			node.left = Insert(node.left, key);
		} else if (key > node.key) {
			node.right = Insert(node.right, key);
		} else {
			return node; // Duplicate keys not allowed
		}

		// Update height of this ancestor node
		node.height = 1 + Math.max(height(node.left), height(node.right));

		// Get the balance factor
		int balance = getBalance(node);

		// If node is unbalanced, then try the 4 cases

		// Left Left Case
		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		// Right Right Case
		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		// Left Right Case
		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// Right Left Case
		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		// Return the (unchanged) node pointer
		return node;
	}

	void insert(int key) {
		root = Insert(root, key);
	}

	void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.print(node.key + " ");
			printInOrder(node.right);
		}
	}

	public static void main(String[] args) {
		// AVL trees are special self-balancing trees.
		// After inserting or removing any number, it checks whether the tree is still balanced.
		// If not, it automatically fixes it using rotations.

		AvlTree tree = new AvlTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);

		System.out.println("Inorder print of AVL tree:");
		tree.printInOrder(tree.root);
	}
}