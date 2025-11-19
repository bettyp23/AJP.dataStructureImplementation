/**
 * Custom implementation of a Singly Linked List data structure.
 * 
 * @param <T> the type of elements in this linked list
 */
public class MyLinkedList<T> {
    
    /**
     * Inner class representing a node in the linked list.
     */
    private class Node<T> {
        T data;
        Node<T> next;
        
        /**
         * Constructs a new node with the given data.
         * 
         * @param data the data to store in this node
         */
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node<T> head;
    private int size;
    
    /**
     * Constructs an empty linked list.
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * Adds an element to the end of the linked list.
     * 
     * @param data the data to add
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    /**
     * Removes the first occurrence of the specified element from the linked list.
     * 
     * @param data the data to remove
     * @return true if the element was found and removed, false otherwise
     */
    public boolean remove(T data) {
        if (head == null) {
            return false;
        }
        
        // If the head node contains the data to remove
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        
        // Search for the node to remove
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
    
    /**
     * Displays all elements in the linked list in order.
     */
    public void display() {
        if (head == null) {
            System.out.println("Linked List: (empty)");
            return;
        }
        
        Node<T> current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("Linked List: ");
        
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" → ");
            }
            current = current.next;
        }
        
        System.out.println(sb.toString());
    }
    
    /**
     * Returns the number of elements in the linked list.
     * 
     * @return the size of the linked list
     */
    public int size() {
        return size;
    }
    
    /**
     * Checks if the linked list is empty.
     * 
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }
}

