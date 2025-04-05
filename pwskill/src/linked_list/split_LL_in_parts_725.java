package linked_list;

class splitLL{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }

	singlell[] splitListToParts(singlell head, int k) {
		int n = 0 ;
		singlell temp = head ;
		
		while(temp!=null) {    // calculate the size of the array 
			n++ ;
			temp = temp.next ;
		}
		        
        int size = n/k ;  // size of every part 
        int extra = n%k ;
        
		singlell[] ans = new singlell[k];

		temp = head ; 
		int length = 1 ;  // length of every part
		
		int indx = 0 ; // index of array
		while(temp!=null) {
			int s = size ;
			if(extra>0) s++ ;
			if(length==1) { ans[indx] = temp ;  indx++; }
			if(length==s) {
				singlell a = temp.next ;
				temp.next = null ;
				temp = a ;
				length = 1;
				extra-- ;
			}else {
				temp = temp.next ;
				length++;
			}
		}
        return ans ;
    }
}
public class split_LL_in_parts_725 {
	public static void main(String[] args) {
		splitLL list = new splitLL();
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(6);
		singlell e = new singlell(8);
		singlell f = new singlell(5);
		singlell g = new singlell(4);
		singlell h = new singlell(9);
		singlell i = new singlell(2);
		singlell j = new singlell(1);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		h.next = i ;
		i.next = j ;
		
		System.out.println("before partition ");
		list.print(a);
		
		System.out.println("after partition ");
		singlell[] result = list.splitListToParts(a, 3);
		for (singlell part : result) {
		    list.print(part);
		}
	}
}
