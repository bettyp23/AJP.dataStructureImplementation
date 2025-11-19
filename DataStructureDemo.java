/**
 * Main application to demonstrate custom implementations of data structures:
 * LinkedList, Stack, Queue, and Binary Search Tree.
 * 
 * @author Your Name
 */
public class DataStructureDemo {
    
    public static void main(String[] args) {
        // Demonstrate Linked List
        demonstrateLinkedList();
        
        // Demonstrate Stack
        demonstrateStack();
        
        // Demonstrate Queue
        demonstrateQueue();
        
        // Demonstrate Binary Search Tree
        demonstrateBinarySearchTree();
    }
    
    /**
     * Demonstrates the MyLinkedList operations.
     */
    private static void demonstrateLinkedList() {
        System.out.println("--- Linked List Demo ---");
        System.out.println();
        MyLinkedList<String> list = new MyLinkedList<>();
        
        // Add elements
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        
        // Display the list
        list.display();
        System.out.println();
        
        // Remove an element
        System.out.println("Removing 'Bob'...");
        boolean removed = list.remove("Bob");
        System.out.println("Removed: " + removed);
        list.display();
        System.out.println();
        
        // Add another element
        System.out.println("Adding 'David'...");
        list.add("David");
        list.display();
        System.out.println();
    }
    
    /**
     * Demonstrates the MyStack operations.
     */
    private static void demonstrateStack() {
        System.out.println("--- Stack Demo ---");
        System.out.println();
        MyStack<String> stack = new MyStack<>();
        
        // Push elements
        System.out.print("Pushed: ");
        stack.push("A");
        System.out.print("A");
        stack.push("B");
        System.out.print(", B");
        stack.push("C");
        System.out.println(", C");
        
        // Peek at top element
        System.out.println("Peek: " + stack.peek());
        System.out.println();
        
        // Pop one element
        System.out.println("Popped: " + stack.pop());
        System.out.println();
        
        // Pop another element
        System.out.println("Popped: " + stack.pop());
        System.out.println();
    }
    
    /**
     * Demonstrates the MyQueue operations.
     */
    private static void demonstrateQueue() {
        System.out.println("--- Queue Demo ---");
        System.out.println();
        MyQueue<String> queue = new MyQueue<>();
        
        // Enqueue elements
        System.out.print("Enqueued: ");
        queue.enqueue("X");
        System.out.print("X");
        queue.enqueue("Y");
        System.out.print(", Y");
        queue.enqueue("Z");
        System.out.println(", Z");
        
        // Peek at front element
        System.out.println("Peek: " + queue.peek());
        System.out.println();
        
        // Dequeue one element
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println();
        
        // Dequeue another element
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println();
    }
    
    /**
     * Demonstrates the BinarySearchTree operations.
     */
    private static void demonstrateBinarySearchTree() {
        System.out.println("--- Binary Search Tree Demo ---");
        System.out.println();
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        
        // Insert elements
        System.out.print("Inserted: ");
        bst.insert(10);
        System.out.print("10");
        bst.insert(5);
        System.out.print(", 5");
        bst.insert(15);
        System.out.print(", 15");
        bst.insert(3);
        System.out.print(", 3");
        bst.insert(7);
        System.out.println(", 7");
        
        // Perform in-order traversal
        bst.inOrderTraversal();
        System.out.println();
        
        // Search for elements
        System.out.println("Contains 7: " + bst.contains(7));
        System.out.println("Contains 20: " + bst.contains(20));
        System.out.println();
        
        // Insert more elements
        System.out.print("Inserted: ");
        bst.insert(12);
        System.out.print("12");
        bst.insert(20);
        System.out.print(", 20");
        bst.insert(1);
        System.out.println(", 1");
        
        // Perform in-order traversal again
        bst.inOrderTraversal();
        System.out.println();
    }
}

