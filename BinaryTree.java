class Node {
    String name;
    Node left, right;

    public Node(String name) {
        this.name = name;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(String name) {
        root = new Node(name);
    }

    // Print root
    public void printRoot() {
        if (root != null)
            System.out.println("Root: " + root.name);
        else
            System.out.println("Tree is empty.");
    }

    // Print left and right children of the root
    public void printChildren(Node node) {
        if (node != null) {
            System.out.println("Node: " + node.name);
            System.out.println("Left Child: " + (node.left != null ? node.left.name : "null"));
            System.out.println("Right Child: " + (node.right != null ? node.right.name : "null"));
        }
    }

    // Traverse top to bottom (root -> children)
    public void traverse(Node node) {
        if (node == null) return;
        System.out.println(node.name);
        traverse(node.left);
        traverse(node.right);
    }

    // Count total nodes
    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Count leaf nodes
    public int countLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    // In-order traversal (left to right)
    public void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.name + " ");
        inOrder(node.right);
    }

    // Mirror tree (flip left and right children)
    public void mirror(Node node) {
        if (node == null) return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

    // Print all paths from root to leaves
    public void printPaths(Node node, String path) {
        if (node == null) return;
        path += node.name + " -> ";
        if (node.left == null && node.right == null) {
            System.out.println(path.substring(0, path.length() - 4)); // Remove trailing arrow
        }
        printPaths(node.left, path);
        printPaths(node.right, path);
    }

    // Check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("mom");
        tree.root.left = new Node("dad");
        tree.root.right = new Node("you");

        tree.printRoot();
        tree.printChildren(tree.root);
        System.out.println("\nTop to Bottom Traversal:");
        tree.traverse(tree.root);
        System.out.println("\nTotal Nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf Nodes: " + tree.countLeafNodes(tree.root));

        System.out.println("\nIn-order Traversal:");
        tree.inOrder(tree.root);
        System.out.println();

        tree.mirror(tree.root);
        System.out.println("\nMirrored Tree In-order Traversal:");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("\nPaths from Root to Leaves:");
        tree.printPaths(tree.root, "");

        System.out.println("\nIs tree empty? " + tree.isEmpty());
    }
}