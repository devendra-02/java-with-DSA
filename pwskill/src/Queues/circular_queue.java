package Queues;

public class circular_queue {

	public static class circularqueue{
		int f = 0 ;
		int r = 0 ;
		int size = 0 ;
		
		int[] arr = new int[4];
		int n = arr.length ;
		
		public void add(int val) throws Exception{         // to add element 
			if(size==0)  {
				f=r=0 ;
			}
			else if(size == n) throw new Exception("queue is full ");    // it throw the error
			
			else if(r<n-1) {   // normal case 
				r++ ;
			}
			else if(r==n-1) {    
				r=0 ;
			}
			arr[r] = val ;
			size++ ;
		}
		
		public int remove()throws Exception {  // to remove element 
			
			if(size==0)  {
				throw new Exception("queue is empty ");
			}
			int data = arr[f]; 
			
			if(f==n-1) {   
				f=0 ;
			}
			else {
				f++ ;
			}
			size-- ;
			return data ;
        }
		
		public int peek()throws Exception {       // to check the top element 
			if(size==0) {
				throw new Exception("queue is empty ");
			}
			int peek =  arr[f] ;
			return peek ;
        }

		public boolean isEmpty() {     // to check queue is empty 
			if(size==0) {
				return true ;
			}
			return false ;
        }
		 
		public void display() {    // to print all the elements 
			if(isEmpty()) {
				System.out.println("queue is empty ");
				return ;
			}
			int count = size ;
			int i = f ;
			while(count>0) {
				System.out.print(arr[i]+" ");
				if(i==n-1) i=0 ;
				else {
					i++ ;
				}
				count-- ;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) throws Exception{
		circularqueue q = new circularqueue();
		System.out.println("is queue is empty "+q.isEmpty());
		q.add(7); 
		q.add(9); 
		q.add(6); 
		q.add(8);  // hear the size is full 
		q.display();
		q.remove();   // we remove so size--
		q.add(4);    // then we add element 
		q.display();
		q.remove();
		q.display();
		System.out.println("peek element "+q.peek());
		q.remove();
		q.display();
		System.out.println("peek element "+q.peek());
		System.out.println("is queue is empty "+q.isEmpty());
	}

}
