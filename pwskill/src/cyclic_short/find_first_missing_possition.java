// leat code - 41
// find first missing position in an array 

//package cyclic_short;
//public class find_first_missing_possition {
//	
//		public static void disappear(int[] arr){
//			int  n = arr.length ;
//			for(int i =1;i<=n+1;i++) {
//				boolean check = false  ;
//				for(int ele : arr) {
//					if(ele==i) {
//						check = true ;
//					break ;
//					}
//				}
//				if(check==false) {
//					System.out.println("missing element is "+ i);
//					return ;
//				}
//			}  }
//		
//		public static void main(String[] args) {
//			int[] arr = {3,4,-1,1};
//			disappear(arr);
//		}
//      }

//****** Hash Table ***************************************************************************************

//package cyclic_short;
//
//import java.util.HashSet;
//
//public class find_first_missing_possition {
//	
//		public static void disappear(int[] arr){
//			int  n = arr.length ;
//			HashSet<Integer> set =  new HashSet<Integer>();
//			for(int ele : arr) {
//				set.add(ele) ;
//			}
//			for(int num=1;num<=n+1;num++) {
//				if(!set.contains(num)) {
//					System.out.println("missing element is "+num);
//					break ;
//				}
//			}
//			}  
//		
//		public static void main(String[] args) {
//			int[] arr = {3,4,-1,1};
//			disappear(arr);
//		}
//      }

//****** runs in O(n) time and uses O(1) auxiliary space *****************************************************************************************************

package cyclic_short;
public class find_first_missing_possition {
	
	public static void swap(int[] arr , int i ,int  j ) {
		int temp = arr[i] ;
		arr[i] = arr[j] ;
		arr[j] = temp ;
	}
		public static void disappear(int[] arr){
			int  n = arr.length ; 
			int i = 0;
			while(i<n) {
				int ele = arr[i] ;
				if(ele<=0 || ele>n || ele==i+1 || ele==arr[ele-1]) i++ ;
				else swap(arr , i , ele-1 );
			}
			for( i=0;i<n;i++) {
				if(arr[i]!=i+1) {
					System.out.println("missing element id "+(i+1));
					break ;
				}
			}
		}
		
		public static void main(String[] args) {
			int[] arr = {3,4,2,-1,1};
			disappear(arr);
		}
      }