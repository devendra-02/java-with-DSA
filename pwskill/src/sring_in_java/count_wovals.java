package sring_in_java;

import java.util.Scanner;

public class count_wovals {
	
	public static boolean isvowel(char ch ) {
		if(ch=='A' || ch=='a' )return true ;
		if(ch=='E' || ch=='e' )return true ;
		if(ch=='I' || ch=='i' )return true ;
		if(ch=='O' || ch=='o' )return true ;
		if(ch=='U' || ch=='u' )return true ;
		
		else return false ;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		int n = s.length();
		int count = 0 ;

		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(isvowel (ch)==true) count++ ;
		}
		System.out.println("no of vowels are "+count);
	}

}
