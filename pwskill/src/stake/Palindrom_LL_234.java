package stake;

import java.util.Stack;

class singlell{
	int val ;
	singlell next ;
	singlell() {}
	singlell(int val, singlell next) { 
		this.val = val; this.next = next ; 
	}
	
	public singlell(int val) {
		this.val = val ;
	}
}
	
	public class Palindrom_LL_234 {

	static void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	static public boolean palindrome(singlell head) {
	Stack<Integer> st = new Stack<Integer>();
	singlell temp = head ;
	
	while (temp != null) {
		st.push(temp.val);
		temp = temp.next ;
	}
	temp = head ;
	while(temp!=null) {
		if(st.pop()!=temp.val) {
			return false ;
		}
		temp = temp.next ;
	}
	return true ;
    }

	public static void main(String[] args) {
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(6);
		singlell e = new singlell(6);
		singlell f = new singlell(7);
		singlell g = new singlell(9);
		singlell h = new singlell(7);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		
		print(a);
		if(palindrome(a)==true) {
			System.out.println(" is palindrom");
		}else {
			System.out.println(" is not a palindrom ");
		}
	}
}
