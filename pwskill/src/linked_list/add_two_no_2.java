package linked_list;

class addno{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell addTwoNumbers(singlell l1, singlell l2) {
		
		singlell ans = new singlell(1);
		
		singlell a = l1 ;
		singlell b = l2 ;
		int carry = 0;
		
		singlell temp = ans ;
		while(a!=null && b!=null) {
			
			int sum = a.val + b.val + carry ;
			singlell add = new singlell(sum%10) ;
			temp.next = add ;
			if(sum>9) carry = 1 ;
			else carry = 0 ;
			
			a = a.next ;
			b = b.next ;
			temp = temp.next ;
		}
		
		while(a!=null) {
			
			int sum = a.val + carry ;
			singlell add = new singlell(sum%10) ;
			temp.next = add ;
			if(sum>9) carry = 1 ;
			else carry = 0 ;
			a = a.next ;
			temp = temp.next ;
		}
		while(b!=null) {
			
			int sum = b.val + carry ;
			singlell add = new singlell(sum%10) ;
			temp.next = add ;
			if(sum>9) carry = 1 ;
			else carry = 0 ;
			b = b.next ;
			temp = temp.next ;
		}
		if(carry!=0) {
			singlell add = new singlell(carry) ;
			temp.next = add ;
		}

        return ans.next ;
    }
}
public class add_two_no_2 {

	public static void main(String[] args) {
		addno list = new addno();
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(9);
		singlell e = new singlell(9);
		
		singlell f = new singlell(5);
		singlell g = new singlell(4);
		singlell h = new singlell(9);
//		singlell i = new singlell(2);
//		singlell j = new singlell(3);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		
		f.next = g ;
		g.next = h ;
//		h.next = i ;
//		i.next = j ;
		
		System.out.print("first list   ");
		list.print(a);
		System.out.print("second list  ");
		list.print(f);
		System.out.print("sum of 2 num ");
		list.print(list.addTwoNumbers(a, f));
	}

}
