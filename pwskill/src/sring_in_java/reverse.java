package sring_in_java;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		StringBuilder s = new StringBuilder(sc.nextLine()) ;
		int start =0 ; int end = s.length()-1 ;
		
		
		while(start<=end) {
			char temp = s.charAt(start);
			s.setCharAt(start ,s.charAt(end));
			s.setCharAt(end, temp);
			start++;
			end-- ;
			}
		System.out.println(s);
	}

}
