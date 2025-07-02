
// print sum of all no divisible by 5 from 1 to 100

package _1apractice;

public class add_no_divisible_by_5 {
	public static void main(String[] args) {

		int ans = 0;
		for (int i = 0; i <= 100; i += 5) {
			System.out.print(i + " ");
			ans += i;
		}
		System.out.println(ans);
	}
}
