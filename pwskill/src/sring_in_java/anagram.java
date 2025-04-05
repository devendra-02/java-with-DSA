package sring_in_java;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s = "gautam" ;
		String t = "amtuag" ;
		
		if(s.length()!=t.length()) { 
			System.out.println("not a anagram");
		    }
		
		
		else{ 
			
			char[] chs = s.toCharArray();
			char[] cht = t.toCharArray();
			
			Arrays.sort(chs);
			Arrays.sort(cht);
			
			System.out.println(chs);
			System.out.println(cht);
			
			 boolean isAnagram = true;
			
			 for(int i=0;i<chs.length;i++) {
				if(chs[i]!=cht[i]) {       // hear we use built in function Arrays.equals(chs, cht)
					isAnagram = false ;    //                                for check equal
				break ; }
			}
			
			 if(isAnagram==true)
				 System.out.println("anagram");
			 else
				 System.out.println("not anagram");
		}
		
	}		
}
