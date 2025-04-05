/*  - given n string consisting of digit from 0to9 . return the 
string which has maximum value */

package sring_in_java;

public class maxvalue_in_arrof_string {

	public static void main(String[] args) {
		String[] arr = {"46","0086","76","43","00000006"};
		String max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			max = maximum(max ,arr[i]) ;
		}
		System.out.println(max);
	}
	
	public static String maximum(String a , String b) { // for find string with large number
		String s = purify(a) , t = purify(b) ;
		if(s.length()>t.length()) return a ;
		if(s.length()<t.length()) return b ;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i)){
				if(s.charAt(i)>t.charAt(i)) return a ;
				else return b ;
			}
		}
		if(a.length()>=b.length()) return a ;
		else return b ;
	}
	
	public static String purify(String t) {   // to remove startingy zeros of 
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)!='0') return t.substring(i) ;  //yha sirf 0 nhi use krna h '0' krna kyoki ye string h naki number 
		}
		return t ;
	}
	
}
