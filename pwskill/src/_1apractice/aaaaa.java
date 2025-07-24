package _1apractice;

public class aaaaa {

	public static boolean checkpekindrom(String s, int i, int j) {
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}

		if (i < j) {
			return checkpekindrom(s, i + 1, j - 1);
		}
		return true;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("enter a string ");
//		String s = sc.nextLine();
//
//		int i = 0;
//		int j = s.length() - 1;
//		boolean palindrom = checkpekindrom(s, i, j);
//
//		if (palindrom) {
//			System.out.println("string is palindrom ");
//		} else {
//			System.out.println("string is not a palindrom ");
//		}
		int num = 10;
		System.out.println(",jhsdjgh" + num++);
		System.out.println(",jhsdjgh" + ++num);
	}

}
