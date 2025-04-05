package linked_list;

class intersaction{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }

	singlell intersactio(singlell a ,singlell b) {
		
		int sizeA = 0 ;
		int sizeB = 0  ;
		
		singlell tempa = a ;   // calculate size of a
		while(tempa!=null) {
			sizeA++ ;
			tempa = tempa.next;
		}
		System.out.println("size of a "+sizeA);
		
		singlell tempb = b ;   // calculate size of b
		while(tempb!=null) {
			sizeB++ ;
			tempb = tempb.next;
		}
		System.out.println("size of aa "+sizeB);
		
//		tempa = a;
//		tempb = b ;
//		if(sizeA>sizeB) {  // sizeA>sizeB          // we use while loop for decrease time complexity
//			for(int i=1;i<=sizeA-sizeB;i++) {
//				tempa = tempa.next ;
//			}
//		}else {  // sizeB>=sizeA 
//			for(int i=1;i<=sizeB-sizeA;i++) {
//				tempb = tempb.next ;
//			}
//		}
//		
////		while(tempa.val!=tempb.val) {  // ye value check krta h 
//		
//		while(tempa!=tempb) {    // ager value node kr re ho
//			tempa = tempa.next ;
//			tempb = tempb.next ;
//		}
//		return tempa ;
//	}
		
//********************* OR **************************************************************************************
		
		while(sizeA > sizeB) {  // we use while loop for decrease time complexity
		sizeA --; //3
        a = a.next;//1
    }
    while(sizeB>sizeA) { 
    	sizeB --;
        b = b.next;
    }
    
//	while(tempa.val!=tempb.val) {  // ye value check krta h 
	
	while(a!=b) {    // ager value node kr re ho
		a = a.next ;
		b = b.next ;
	}
	return a ;
	}
}
public class intersection_of_two_LL {
	
	public static void main(String[] args) {
		intersaction list = new intersaction();
		singlell a = new singlell(20);
		singlell b = new singlell(10);
		singlell c = new singlell(30);
		singlell d = new singlell(50);
		singlell e = new singlell(60);
		singlell f = new singlell(70);
		
		singlell aa = new singlell(40);
		singlell bb = new singlell(80);
		singlell cc = new singlell(60);
		singlell dd = new singlell(70);
		
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		
		aa.next = bb ;
//		aa.next = cc ;  // ager value compare kr re ho
//		cc.next = dd ;
		
		bb.next = e ;  //  ager node compare kr re ho
		
		list.print(a );
		list.print(aa);
			
		singlell ans = list.intersactio(a, aa) ;
		if (ans != null) {
            System.out.println("Intersection at node with value: " + ans.val);
        } else {
            System.out.println("No intersection found.");
        }
	}
}


	
		