package cyclic_short;
import java.util.Scanner ;
public class C_S_programm {
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}

	public static void cyclicsort(int[] arr) {
		int n = arr.length ;
		for(int cyclestart=0;cyclestart<n;cyclestart++) {
			int item = arr[cyclestart];
			int pos = cyclestart;
			
			// find the correct position where we put the element 
			for(int i=cyclestart;i<n;i++) {
				if(arr[i]<item)
					pos++ ;
			}
			// if element is already  at correct position 
			if(pos==cyclestart) {
				continue ; }
			// Skip duplicates
            while (item == arr[pos]) {     // if item = to the element present at pos
                pos++;
            }
            // swap the item with correct position 
			if(pos!=cyclestart) {
				int temp = item ;
				item = arr[pos] ;
				arr[pos] = temp ;
			}
			// rotate the remaining element in cycle  
			 while (pos != cyclestart) {
	                pos = cyclestart;

	                for (int i = cyclestart + 1; i < n; i++) {
	                    if (arr[i] < item) {
	                        pos++;
	                    }
	                }

	                while (item == arr[pos]) {
	                    pos++;
	                }

	                if (item != arr[pos]) {
	                    int temp = item;
	                    item = arr[pos];
	                    arr[pos] = temp;
	                }
	            }
		}
	}
		public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in) ;
//		System.out.println("enter the size of array ");
//		int m = sc.nextInt();
//		int[] arr = new int[m];
//		System.out.println("enter the element in array ");
//		for(int i=0;i<m;i++) {
//			arr[i] = sc.nextInt();
//		}
			int[] arr = {3, 1, 2, 0, 4, 5};
		print(arr);
		cyclicsort(arr);
		print(arr);
	}

}

//***** more optimize code ********************************************************************************************************************************************************
//package cyclic_short;
//import java.util.Scanner;
//
//public class C_S_programm {
//
//    public static void print(int[] arr) {
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void cyclicsort(int[] arr) {
//        int n = arr.length;
//        int i = 0;
//
//        while (i < n) {
//            int correctIndex = arr[i];  // Correct index for arr[i]
//
//            if (arr[i] >= 0 && arr[i] <n && arr[i] != arr[correctIndex]) {
//                swap(arr, i, correctIndex);
//            } else {
//                i++;  // Move to the next index only if arr[i] is correctly placed
//            }
//        }
//    }
//
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of the array: ");
////        int m = sc.nextInt();
////        int[] arr = new int[m];
////
////        System.out.println("Enter the elements in the array: ");
////        for (int i = 0; i < m; i++) {
////            arr[i] = sc.nextInt();
////        }
//
//    	int[] arr = {3, 7, 1, 9, 4, 6, 6, 8, 5,0};
//    	
//        System.out.println("Original Array:");
//        print(arr);
//
//        cyclicsort(arr);
//
//        System.out.println("Sorted Array:");
//        print(arr);
//
//       
//    }
//}