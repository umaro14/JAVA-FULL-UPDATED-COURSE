package DSA.STACK;

import java.util.EmptyStackException;

public class Stack {
    private Node top; // Reference to the top node in the stack
    private int size; // Size of the stack



    // Node class represents each element in the stack
    private class Node {
        int data;   // The data stored in the node
        Node next;  // Reference to the next node

        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    
    // Constructor to create an empty stack
    public Stack() {
        top = null; // No elements yet, so top is null
        size = 0;   // Size starts at 0
    }

    // Push method to add an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data); // Create a new node with the given data

        // If stack is empty, the new node becomes the top
        if (top == null) {
            top = newNode;
        } else {
            // Otherwise, set the new node's next to the current top
            newNode.next = top;
            top = newNode; // New node becomes the top of the stack
        }
        size++; // Increase the size of the stack
    }

    // Pop method to remove and return the top element
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // If empty, throw exception
        }
        int data = top.data; // Get the data from the top node
        top = top.next; // Move the top to the next node
        size--; // Decrease the size of the stack
        return data; // Return the data from the popped node
    }

    // Peek method to look at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // If empty, throw exception
        }
        return top.data; // Return the data from the top node
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // If top is null, stack is empty
    }

    // Method to get the size of the stack
    public int size() {
        return size; // Return the number of elements in the stack
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a new stack
        stack.push(1); // Add 1 to the stack
        stack.push(2); // Add 2 to the stack
        stack.push(3); // Add 3 to the stack

        // Display the size and top element
        System.out.println("Size: " + stack.size()); // Output: 3
        System.out.println("Top element: " + stack.peek()); // Output: 3

        // Pop and display the top element
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Size: " + stack.size()); // Output: 2
    }
}
