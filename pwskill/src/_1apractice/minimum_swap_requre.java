package _1apractice;

import java.util.ArrayList;

public class minimum_swap_requre {

	public static int swapcount(String s, char x) {

		ArrayList<Integer> position = new ArrayList<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == x) {
				position.add(i);
			}
		}
		int m = position.size();
		if (m <= 1) {
			return 0;
		}
		int median = m / 2;
		int medianindx = position.get(median);

		int swap = 0;
		for (int j = 0; j < m; j++) {
			int idealposition = medianindx - median + j;
			swap += Math.abs(position.get(j) - idealposition);
		}

		return swap;
	}

	public static void main(String[] args) {
		String S = "akbkckdkek";
		char x = 'k';

		int ans = swapcount(S, x);
		System.out.println("no of swaps are " + ans);
	}

}
