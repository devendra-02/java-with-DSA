package linked_list;

import java.util.Arrays;

class minmax{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	public int[] nodesBetweenCriticalPoints(singlell head) {
		int[] ans = {-1,-1};
		if(head.next.next==null) return ans ;
		singlell left = head ;
		singlell mid = head.next;
		singlell right = head.next.next;
		int first = -1 ,last = -1 ;
		int mindistance = Integer.MAX_VALUE;
		int idx=2;
		while(right!=null) {
			if(left.val>mid.val && right.val>mid.val || left.val<mid.val && right.val<mid.val) {
				if(first==-1) first=idx ;
				
				if(last!=-1) {
					int dis = idx-last ;
					mindistance = Math.min(mindistance, dis);
				}
				last = idx ;
			}
			idx++ ;
			left = left.next ;
			mid = mid.next ;
			right = right.next ;
		}
		if(first==last)return ans ;
		else {ans[0]=mindistance ; ans[1]=last-first ;}
		return ans ;
    }
}
public class FindtheMin_andMax_No_ofNodesBetweenCriticalPoints_2058 {

	public static void main(String[] args) {
		minmax list = new minmax();
		singlell a = new singlell(6);
		singlell b = new singlell(8);
		singlell c = new singlell(4);
		singlell d = new singlell(1);
		singlell e = new singlell(9);
		singlell f = new singlell(6);
		singlell g = new singlell(6);
		singlell h = new singlell(10);
		singlell i = new singlell(6);
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
		for(int i1=1;i1<=10;i1++) {
			System.out.print(i1+" ");
		}System.out.println();
		
		System.out.println("after partition ");
		int[] result = list.nodesBetweenCriticalPoints(a);
		
		// Properly print the result array
        System.out.println(Arrays.toString(result));
	}

}
