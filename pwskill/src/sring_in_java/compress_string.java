package sring_in_java;


public class compress_string {

	public static void main(String[] args) {
		String s = "aaaagggeeeccuuudehh" ;
		char[] arr = s.toCharArray();
		StringBuilder ans = new StringBuilder("");
		int i=0 ,j=0 ;
		while(j<arr.length) {
			if(arr[j]==arr[i]) j++ ;
			else {
				ans.append(arr[i]) ;
				int length = j-i ;
				if(length>1) ans.append(length) ;
				i=j ;
			}
		}
		ans.append(arr[i]) ;        // last me loop tut jata h to h print ni hota isliye
		int length = j-i ;
		if(length>1) ans.append(length) ;
		System.out.println(ans);
	}

}
