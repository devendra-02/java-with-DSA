package linked_list;
class copynode {
    int val;
    copynode next;
    copynode random;
    copynode(){}

    void print(copynode a) {
    	copynode temp = a;  
        while (temp != null) {
            System.out.print("[" + temp.val + ", " +temp.random.val+ "] ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public copynode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    
    copynode deepCopy (copynode head) {
        copynode head2 = new copynode(head.val);
        copynode t1 = head.next;
        copynode t2 = head2;
        while(t1!=null){
            copynode temp = new copynode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
            return head2 ;
    }
   
   void assignRandom(copynode head,copynode head2){
      copynode t1 = head ;
      copynode t2 = head2 ;
      while(t1!=null){
        t2 = t1.next;
        if(t1.random!=null) t2.random = t1.random.next ;
        t1 = t1.next.next;
      }
   }

   void split (copynode head, copynode head2) {
        copynode t1 = head;
        copynode t2 = head2;
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1==null) break;
            t2.next = t1.next;
            t2= t2.next;
        }
    }

   void connectAlternatively (copynode head, copynode head2) {
       copynode t1 = head;
       copynode t2 = head2;
       copynode dummy = new copynode(-1);
       copynode t = dummy;
       while(t1!=null && t2!=null) {
          t.next = t1;
          t1 = t1.next;
          t = t.next;
          t.next = t2;
          t2 = t2.next;
          t = t.next;
        }
   }
   
   copynode copyRandomList(copynode head) {
       if(head==null) return null;
       // Step 1: Create deep copy w/o random connections copynode head2 = deepCopy (head);
       copynode head2 = deepCopy(head);
       // Step 2: Join head and head2 alternatively nectAlternatively (head, head2);
       connectAlternatively(head , head2) ;
       // Step 3: Assign random pointers assignRandom(head, head2);
       assignRandom(head,head2);
       // Step 4: Split the Linked List split (head, head2);
       split(head,head2);
       return head2 ;
   }
}



public class Copy_Listwith_RandomPointer_138 {
	public static void main(String[] args) {
		copynode list = new copynode();
		copynode a = new copynode(7);
        copynode b = new copynode(13);
        copynode c = new copynode(11);
        copynode d = new copynode(10);
        copynode e = new copynode(1);
        
      a.random = b;
      b.random = a;
      c.random = e;
      d.random = c;
      e.random = a;
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("before ");
        list.print(a);
        
        copynode copyednode = list.copyRandomList(a) ;
        System.out.println("after ");
        list.print(copyednode);
	}
}