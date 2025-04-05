package Queues;

public class queue_implimentation_using_array {

	public static class queuea{
		int front = -1 ;   // front
		int rear = -1 ;   // rear
		
		int[] arr = new int[100] ;
		
		public void add(int val) {         // to add element 
			if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) { // First element
            	front = rear = 0;
            } else {
            	rear++;
            }
            arr[rear] = val;
		}
		
		public int remove() {       // to  remove the element 
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = arr[front];
            front++; 
            return removed;
        }
		
		public int peek() {       // to  remove the element 
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            int peek = arr[front];
            return peek;
        }

		public boolean isEmpty() {     // to check queue is empty 
			if(front == -1 || front > rear) { return true;  }
			return false ;
        }
		 
		public void display() {    // to print all the elements 
			if(isEmpty()) {
				System.out.println("queue is empty ");
				return ;
			}
			System.out.print("queue elements are : ");
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		// So, they will be used when we remove public static from the front of the class.{ like - class queuea }
//		queue_implimentation_using_array object = new queue_implimentation_using_array();
//		queuea q = object.new queuea();
		
		queuea q = new queuea();
		System.out.println("is queue is empty "+q.isEmpty());
		q.add(1); 
		q.add(2); 
		q.add(3); 
		q.add(4); 
		q.display();
		System.out.println("peek element "+q.peek());
		q.remove();
		q.display();
		System.out.println("peek element "+q.peek());
		System.out.println("is queue is empty "+q.isEmpty());
	}

}
