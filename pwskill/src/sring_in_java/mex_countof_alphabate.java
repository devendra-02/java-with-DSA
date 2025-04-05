package sring_in_java;

import java.util.Scanner;

public class mex_countof_alphabate {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in) ;
		System.err.println("enter the string");
		String s = sc.next();
		
		int[] freq = new int[26] ;  //  frequency arr of alphabates 
		// at 0-a , 1-b ,2-c ............
		
		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			int idx = (int)ch-97 ;
//			freq[idx]++ ;
			 freq[(int)s.charAt(i)-97]++ ;
		}
	
		int maxfre = -1 ;
		for(int j=0;j<freq.length;j++) {
			maxfre = Math.max(maxfre, freq[j]);
		}
		for(int j=0;j<freq.length;j++) {
			if(maxfre==freq[j]) {
				char ch = (char)(j+97);
				System.out.print(ch+" ");
			}
		
				
		}
	}

}
