package _1apractice;

import java.util.Scanner;

public class pattern_printing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a no ");
		int n = 5;
		System.out.println();

//		 1 1 1 1 
//		 2 2 2 2 
//		 3 3 3 3 
//		 4 4 4 4

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

//		 1 2 3 4 
//		 1 2 3 
//		 1 2 
//		 1
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		A 
//		A B 
//		A B C 
//		A B C D
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= 1 + i; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}

//		 1 
//		 A B 
//		 1 2 3 
//		 A B C D 
//		 1 2 3 4 5
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= 1 + i; j++) {
				if (i % 2 == 0) {
					System.out.print(j + " ");
				} else {
					System.out.print((char) (64 + j) + " ");
				}
			}
			System.out.println();
		}

//		 * 
//		 ** 
//		 *** 
//		 **** 
//		 *** 
//		 ** 
//		 *
		System.out.println();

		int numofloop = n * 2;
		for (int i = 1; i <= n * 2 - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= numofloop - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

//		 1 
//		 2 1 
//		 3 2 1 
//		 4 3 2 1
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i - j + " ");
			}
			System.out.println();
		}

//          1 
//        1 2 3 
//      1 2 3 4 5 
//    1 2 3 4 5 6 7
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		 	  A 
//    	    A B C 
//	 	  A B C D E 
//		A B C D E F G
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}

//		A 
//    B A B 
//  C B A B C 
//D C B A B C D
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print((char) (64 + i - j) + " ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print((char) (64 + 1 + j) + " ");
			}
			System.out.println();
		}

//		A B C D E F G 
//		A B C   E F G 
//		A B       F G 
//		A           G
		System.out.println();

		for (int i = 0; i < n * 2 - 1; i++) {
			System.out.print((char) (65 + i) + " ");
		}
		System.out.println();

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print((char) (64 + j + i + n) + " ");
			}
			System.out.println();
		}

//		 1 2 3 4 3 2 1 
//		 1 2 3   3 2 1 
//		 1 2       2 1 
//		 1           1
		System.out.println();

		for (int i = 1; i <= n * 2 - 1; i++) {
			if (i <= n) {
				System.out.print(i + " ");
			} else {
				System.out.print(n * 2 - i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(n - i - j + 1 + " ");
			}
			System.out.println();
		}

//		 *     *
//		  *   * 
//	       * * 
//	        *  
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - i; j++) {
				if (i == j || j == n * 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

//	     *
//	    * *
//	   *   *
//	  *     *
//	 *       *
//	  *     *
//	   *   *
//	    * *
//	     *   
		System.out.println();

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n + i; j++) {
				if (j == n + i - 1 || j == n - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - i; j++) {
				if (i == j || j == n * 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

//        1 
//      2   2 
//    3       3 
//  4           4 
//5               5 
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 1; j < i; j++) {
				if (j == i - 1) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//	     *
//	    ***
//	   * * *
//	  *  *  *
//	 *********
//	  *  *  *
//	   * * *
//	    ***
//	     *
		System.out.println();

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n + i; j++) {
				if (j == n + i - 1 || j == n - i + 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - i; j++) {
				if (i == j || j == n * 2 - i || j == n || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
