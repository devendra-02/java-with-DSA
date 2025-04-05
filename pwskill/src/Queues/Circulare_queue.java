package Queues;

class MyCircularQueue {
    int[] v;
    int start = 0, len = 0;

    public MyCircularQueue(int k) {
        v = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        v[(start + len++) % v.length] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        start = (start + 1) % v.length;
        --len;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return v[start];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return v[(start + len - 1) % v.length];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == v.length;
    }
}

// Test the Circular Queue
public class Circulare_queue {

	public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(3);
        
        System.out.println(queue.enQueue(1)); // true
        System.out.println(queue.enQueue(2)); // true
        System.out.println(queue.enQueue(3)); // true
        System.out.println(queue.enQueue(4)); // false (Queue is full)
        
        System.out.println(queue.Rear()); // 3
        System.out.println(queue.isFull()); // true
        
        System.out.println(queue.deQueue()); // true
        System.out.println(queue.enQueue(4)); // true
        System.out.println(queue.Rear()); // 4
    }
}
