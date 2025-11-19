/**
 * Custom implementation of a Binary Search Tree (BST) data structure.
 * 
 * @param <T> the type of elements in this BST, must implement Comparable
 */
public class BinarySearchTree<T extends Comparable<T>> {
    
    /**
     * Inner class representing a node in the binary search tree.
     */
    private class Node {
        T data;
        Node left;
        Node right;
        
        /**
         * Constructs a new node with the given data.
         * 
         * @param data the data to store in this node
         */
        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node root;
    
    /**
     * Constructs an empty binary search tree.
     */
    public BinarySearchTree() {
        this.root = null;
    }
    
    /**
     * Inserts an element into the binary search tree.
     * 
     * @param data the data to insert
     */
    public void insert(T data) {
        root = insertRecursive(root, data);
    }
    
    /**
     * Recursive helper method to insert a node into the BST.
     * 
     * @param node the current node in the recursion
     * @param data the data to insert
     * @return the updated node
     */
    private Node insertRecursive(Node node, T data) {
        // Base case: if tree is empty, create a new node
        if (node == null) {
            return new Node(data);
        }
        
        // Otherwise, recur down the tree
        if (data.compareTo(node.data) < 0) {
            node.left = insertRecursive(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = insertRecursive(node.right, data);
        }
        // If data is equal, we don't insert duplicates (or you could handle it differently)
        
        return node;
    }
    
    /**
     * Checks if the binary search tree contains the specified element.
     * 
     * @param data the data to search for
     * @return true if the element is found, false otherwise
     */
    public boolean contains(T data) {
        return containsRecursive(root, data);
    }
    
    /**
     * Recursive helper method to search for a value in the BST.
     * 
     * @param node the current node in the recursion
     * @param data the data to search for
     * @return true if found, false otherwise
     */
    private boolean containsRecursive(Node node, T data) {
        // Base case: if tree is empty or node is null
        if (node == null) {
            return false;
        }
        
        // If data matches current node's data
        if (data.compareTo(node.data) == 0) {
            return true;
        }
        
        // Recur down the tree
        if (data.compareTo(node.data) < 0) {
            return containsRecursive(node.left, data);
        } else {
            return containsRecursive(node.right, data);
        }
    }
    
    /**
     * Performs an in-order traversal of the binary search tree and displays the elements.
     */
    public void inOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        inOrderRecursive(root, sb);
        String result = sb.toString().trim();
        System.out.println("In-order Traversal: " + result);
    }
    
    /**
     * Recursive helper method for in-order traversal.
     * 
     * @param node the current node in the recursion
     * @param sb the StringBuilder to build the output string
     */
    private void inOrderRecursive(Node node, StringBuilder sb) {
        if (node != null) {
            inOrderRecursive(node.left, sb);
            sb.append(node.data).append(" ");
            inOrderRecursive(node.right, sb);
        }
    }
    
    /**
     * Checks if the binary search tree is empty.
     * 
     * @return true if the tree is empty, false otherwise
     */
    public boolean isEmpty() {
        return root == null;
    }
}

