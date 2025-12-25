package DSA.Queue;

/*package DSA.Queue;

public class Main {

    // Front and rear pointers
    private Node front;
    private Node rear;



    // Node class representing each element in the queue
    private static class Node {
        int data;
        Node next;


        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    // Constructor to initialize the queue
    public Main() {
        front = null;
        rear = null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return front.data;
    }

    // Method to print the queue elements
    public void printQueue() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}*/