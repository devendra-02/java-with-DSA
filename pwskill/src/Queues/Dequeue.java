package Queues;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class Deque {
    Node front;
    Node rear;
    int count;

    public Deque() {
        front = null;
        rear = null;
        count = 0;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        count++;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        count++;
    }

    public int getFirst() {
        if (front == null) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        return front.data;
    }

    public int getLast() {
        if (rear == null) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        return rear.data;
    }

    public int pollFirst() {
        if (front == null) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        int val = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; // Deque is now empty
        }
        count--;
        return val;
    }

    public int pollLast() {
        if (rear == null) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        int val = rear.data;
        rear = rear.prev;
        if (rear != null) {
            rear.next = null;
        } else {
            front = null; // Deque is now empty
        }
        count--;
        return val;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}

public class Dequeue {

	public static void main(String[] args) {
		
		Deque deque = new Deque();
		System.out.println("Is deque empty? " + deque.isEmpty()); // true

        // Adding elements to the front and back
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        
     // Current deque: [5, 10, 20, 30]
        System.out.println("First element: " + deque.getFirst()); // 5
        System.out.println("Last element: " + deque.getLast());   // 30
        System.out.println("Deque size: " + deque.size());        // 4
        
     // Removing elements
        System.out.println("Removed first: " + deque.pollFirst()); // 5
        System.out.println("Removed last: " + deque.pollLast());   // 30

        // Current deque: [10, 20]
        System.out.println("First element: " + deque.getFirst()); // 10
        System.out.println("Last element: " + deque.getLast());   // 20
        System.out.println("Deque size: " + deque.size());        // 2

        // Removing remaining elements
        System.out.println("Removed first: " + deque.pollFirst()); // 10
        System.out.println("Removed last: " + deque.pollLast());   // 20

        // Checking if deque is empty again
        System.out.println("Is deque empty? " + deque.isEmpty()); // true
        
        deque.pollFirst();   // throw an error - Dequeue is empty
	}

}
