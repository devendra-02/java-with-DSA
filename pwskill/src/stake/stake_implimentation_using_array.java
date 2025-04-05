//***************** using Array *********************************************************************************************************************************

//package stake;
//
//class stackimplimentaton{
//	private int[] arr = new int[5] ;
//	private int idx = 0 ;
//	
//	void push(int ele) {
//		if(idx==arr.length-1)  System.out.println("stsck is full");
//		
//		arr[idx]=ele ;
//		idx++ ;
//	}
//	
//	int peek() {
//		if(isempty()) {
//			System.out.println("stack is empty ");
//			return -1 ;
//		}
//			return arr[idx-1];
//	}
//	
//	void display() {
//		for(int i=0;i<idx;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//
//	int pop() {
//		if(idx==0) {
//			System.out.println("stack is empty ");
//			return -1 ;
//		}
//		int temp = arr[idx-1] ;
//		arr[idx-1]=0;
//		idx-- ;
//			return temp;
//	}
//	
//	int size() {
//		return idx ;
//	}
//	
//	boolean isempty() {
//		if(idx==0) { System.out.println("true"); return true ;}
//		else { System.out.println("false "); return false ;}
//	}
//
//}
//public class stake_implimentation_using_array {
//
//	public static void main(String[] args) {
//		stackimplimentaton list = new stackimplimentaton();
//		
//		list.push(1);
//		list.push(2);
//		list.push(3);
//		list.push(4);
//		list.display();
//		
//		System.out.println("topmost ele is :"+list.peek());
//		
//		list.pop();
//		System.out.println("after pop the ele ");
//		list.display();
//		
//		System.out.println("size of stack is :"+list.size());
//		
//		list.isempty();
//	}
//
//}

//***************** using ArrayList *********************************************************************************************************************************

package stake;

import java.util.ArrayList;

class stackimplimentaton{
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	void push(int ele) {
		arr.add(ele) ;
	}
	
	int peek() {
		if(isempty()) {
			System.out.println("stack is empty ");
			return -1 ;
		}
			return arr.get(arr.size()-1);
	}
	
	void displa() {
		if(isempty()) {
			System.out.println("stack is empty ");
			return  ;
		}
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}

	int pop() {
		if(isempty()) {
			System.out.println("stack is empty ");
			return -1 ;
		}
			return arr.remove(arr.size()-1);
	}
	
	int size() {
		return arr.size() ;
	}
	
	boolean isempty() {
		return arr.isEmpty() ;
	}

}
public class stake_implimentation_using_array {

	public static void main(String[] args) {
		stackimplimentaton list = new stackimplimentaton();
		
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
	}

}