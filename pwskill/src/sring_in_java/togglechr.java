package sring_in_java;

import java.util.Scanner;

public class togglechr {

	public static void main(String[] args) {
		
//		toggle mean capital letter  ko small me or small letter ko cpital me 
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the string ");
		StringBuilder s = new StringBuilder(sc.nextLine());
		int n = s.length() ;
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			int ascii = (int)ch ;
			if(ascii>=65 && ascii<=90) {
				ascii += 32 ;
				ch = (char)ascii ;
				s.setCharAt(i, ch);
			}
			else if(ascii>=97 && ascii<=122) {
				ascii -= 32 ;
				ch = (char)ascii ;
				s.setCharAt(i, ch);
			}
		}
		System.out.println(s);
	}

}
