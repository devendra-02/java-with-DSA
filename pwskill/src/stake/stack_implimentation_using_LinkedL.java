package stake;


class nod{
	int val ;
	nod next ;
	nod(int val){
		this.val = val ;
	}
}

class stakell{
	nod head = null ;
	int size = 0;
	
	int size() {
		return size ;
	}
	
	void push(int val) {
		nod temp = new nod(val);
		temp.next = head ;
		head = temp ;
		size++ ;
	}
	
	int pop() {
		if(head==null) {
			System.out.println("stack is empty ");
			return -1;
		}
		int temp = head.val ;
		head = head.next ;
		size-- ;
		return temp ;
	}
	
	void displa() {
		nod temp = head ;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next ;
		}
		System.out.println();
	}
	
	int peek() {
		int temp = head.val ;
		return temp ;
	}
	
	boolean isempty() {
		if(head==null) return true ;
		else return false ;
	}
	
}

public class stack_implimentation_using_LinkedL {
	public static void main(String[] args) {
		stakell list = new stakell();
		System.out.println("is stack is empty :"+list.isempty());
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.displa();
		
		System.out.println("topmost ele is :"+list.peek());
		
		list.pop();
		System.out.println("after pop the ele ");
		list.displa();
		
		System.out.println("size of stack is :"+list.size());
		
		list.isempty();
		System.out.println("is stack is empty :"+list.isempty());
	}

}
