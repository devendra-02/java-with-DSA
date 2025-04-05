package recursion;

public class count_and_say {

	public static String countandsay(int n) {
		if(n==1) return "1" ;
		String s = countandsay(n-1) ;
		String ans = "" ;
		int i=0 ;int j=0 ;
		while(j<s.length()) {
			if(s.charAt(i)==s.charAt(j)) j++ ;
			else {
				int len = j-i ;
				ans += len ;
				ans += s.charAt(i);
				i=j ;
			}
		}
		int len = j-i ;
		ans += len ;
		ans += s.charAt(i);
		return ans ;
	}
	public static void main(String[] args) {
		int n = 3;
		countandsay(n) ;
		System.out.println(countandsay(n));

	}

}
