package sring_in_java;

import java.util.ArrayList;

public class minimum_no_of_swap {

	public static int swapCount(String s, char c) {
		ArrayList<Integer> position = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				position.add(i);
			}
		}

		int m = position.size();
		if (m <= 1)
			return 0;

		int medianindex = m / 2;
		int medianvalue = position.get(medianindex);

		int swap = 0;
		for (int i = 0; i < m; i++) {
			int idlpos = medianvalue - medianindex + i;
			swap += Math.abs(idlpos - position.get(i));
		}

		return swap;
	}

	public static void main(String[] args) {
		String S = "akbkckdkek";
		char x = 'k';

		int ans = swapCount(S, x);
		System.out.println("No of swaps are: " + ans);
	}

}
