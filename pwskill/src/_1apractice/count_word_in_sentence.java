package _1apractice;

public class count_word_in_sentence {
	public static void main(String[] args) {
		String s = "The sun dipped below the horizon,  painting the sky with shades of orange and pink.";
		int word = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1 && s.charAt(i) != ' ') {
				word++;
			}
			if (i > 0 && (int) s.charAt(i) == 32 && (int) s.charAt(i - 1) == 32) {
				continue;
			}
			if ((int) s.charAt(i) == 32) {
				word++;
			}
		}
		System.out.println("no of worde in sentence is " + word);
	}
}
