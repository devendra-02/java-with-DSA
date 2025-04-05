//package array_basic;
//
//public class mearge_K_sorted_list_23 {
//
//	ListNode merge(ListNode list1 , ListNode list2) {
//		ListNode ans = new ListNode(-1);
//		ListNode a = ans ;
//		while(list1!=null && list2 != null) {
//			if(list1.val<list2.val) {
//				a.next = list1;
//				list1 = list1.next ;
//			}else {
//				a.next = list2;
//				list2 = list2.next ;
//			}
//			a = a.next;  // ✅ Move the pointer forward
//		}
//		while(list1!=null) {
//				a.next = list1;
//				list1 = list1.next ;
//				a = a.next;  // ✅ Move forward
//		}
//		while(list2!=null) {
//			a.next = list2;
//			list2 = list2.next ;
//			a = a.next;  // ✅ Move forward
//	}
//		return ans.next ;
// }
//public ListNode mergeKLists(ListNode[] lists) {
//    ListNode ans = null ;
//    for (ListNode temp : lists) {
//        ans = merge(temp, ans);
//    }
//    return ans ;
//}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
