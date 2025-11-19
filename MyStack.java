/**
 * Custom implementation of a Stack data structure using a linked list.
 * 
 * @param <T> the type of elements in this stack
 */
public class MyStack<T> {
    
    /**
     * Inner class representing a node in the stack.
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
    
    private Node<T> top;
    private int size;
    
    /**
     * Constructs an empty stack.
     */
    public MyStack() {
        this.top = null;
        this.size = 0;
    }
    
    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param data the data to push
     */
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    /**
     * Removes and returns the element at the top of the stack.
     * 
     * @return the element at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return the element at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        
        return top.data;
    }
    
    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == null;
    }
    
    /**
     * Returns the number of elements in the stack.
     * 
     * @return the size of the stack
     */
    public int size() {
        return size;
    }
}

