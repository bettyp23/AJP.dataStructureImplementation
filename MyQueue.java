/**
 * Custom implementation of a Queue data structure using a linked list.
 * 
 * @param <T> the type of elements in this queue
 */
public class MyQueue<T> {
    
    /**
     * Inner class representing a node in the queue.
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
    
    private Node<T> front;
    private Node<T> rear;
    private int size;
    
    /**
     * Constructs an empty queue.
     */
    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    /**
     * Adds an element to the rear of the queue.
     * 
     * @param data the data to enqueue
     */
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        
        if (rear == null) {
            // Queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    /**
     * Removes and returns the element at the front of the queue.
     * 
     * @return the element at the front of the queue
     * @throws RuntimeException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }
        
        T data = front.data;
        front = front.next;
        
        // If queue becomes empty, update rear
        if (front == null) {
            rear = null;
        }
        
        size--;
        return data;
    }
    
    /**
     * Returns the element at the front of the queue without removing it.
     * 
     * @return the element at the front of the queue
     * @throws RuntimeException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }
        
        return front.data;
    }
    
    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return front == null;
    }
    
    /**
     * Returns the number of elements in the queue.
     * 
     * @return the size of the queue
     */
    public int size() {
        return size;
    }
}

