package linked_list;

class listpartion{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }

	singlell partition(singlell head, int x) {
		singlell a = new singlell(1) ;
		singlell atemp = a ;
		singlell b = new singlell(1) ;
		singlell btemp = b ;
		
		singlell t = head ;
		while(t!=null) {
			if(t.val<x) {
				atemp.next = t ;
				atemp = atemp.next ;
			}else {
				btemp.next = t ;
				btemp = btemp.next ; 
			}
			t = t.next;
		}
		btemp.next = null ;
		atemp.next = b.next ;
        return  a.next ;
    }

}
public class partion_list_86 {

	public static void main(String[] args) {
		listpartion list = new listpartion();
		singlell a = new singlell(1);
		singlell b = new singlell(4);
		singlell c = new singlell(3);
		singlell d = new singlell(2);
		singlell e = new singlell(5);
		singlell f = new singlell(2);
		singlell g = new singlell(47);
		singlell h = new singlell(89);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		
		System.out.println("before sorting ");
		list.print(a);
		System.out.println("after partitioning  ");
		list.print(list.partition(a,3));
	}

}
