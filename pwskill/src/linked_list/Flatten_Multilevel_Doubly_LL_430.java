package linked_list;

class flatll {
    public int val;
    public flatll prev;
    public flatll next;
    public flatll child;

    public flatll(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }
}

class Solution {
	
	 void print(flatll a) {
		 flatll temp = a ; 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		 System.out.println();
	 }
	 
    public flatll flatten(flatll head) {
        flatll temp = head;
        while (temp != null) {
            flatll n = temp.next;
            if (temp.child != null) {
                flatll c = flatten(temp.child); // hear the magic of recursion
                flatll d = c;
                while (d.next != null) {
                    d = d.next;
                }
                temp.next = c;
                c.prev = temp;
                d.next = n;
                if (n != null) n.prev = d;

                temp.child = null;
            }
            temp = n;
        }
        return head;
    }
}

public class Flatten_Multilevel_Doubly_LL_430 {

	public static void main(String[] args) {
		Solution list = new Solution();
		flatll one = new flatll(1);
        flatll two = new flatll(2);
        flatll three = new flatll(3);
        flatll four = new flatll(4);
        flatll five = new flatll(5);
        flatll six = new flatll(6);
        flatll seven = new flatll(7);
        flatll eight = new flatll(8);
        flatll nine = new flatll(9);
        flatll ten = new flatll(10);
        flatll eleven = new flatll(11);
        flatll twelve = new flatll(12);

        one.next = two; two.prev = one;
        two.next = three; three.prev = two;
        three.next = four; four.prev = three;
        four.next = five; five.prev = four;
        five.next = six; six.prev = five;

        three.child = seven;
        seven.next = eight; eight.prev = seven;
        eight.next = nine; nine.prev = eight;
        nine.next = ten; ten.prev = nine;

        eight.child = eleven;
        eleven.next = twelve; twelve.prev = eleven;
        
        list.flatten(one);
        list.print(one);
	}

}
