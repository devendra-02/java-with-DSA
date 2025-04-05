package sring_in_java;

public class sentence_reverce {
	
	public static void reverce(StringBuilder sc,int start,int end) {
		while(start<=end) {
			char temp = sc.charAt(start);
			sc.setCharAt(start ,sc.charAt(end));
			sc.setCharAt(end, temp);
			start++;
			end-- ;
			}
	}

	public static void main(String[] args) {
		
		StringBuilder sc = new StringBuilder("hellow boys from kota") ;
		int n = sc.length();
		int start = 0 ;
		int end =0 ;
		while(end<n) {
			if(sc.charAt(end)!=' ') end++ ;
			else {
				reverce(sc,start,end-1);
				start=end+1 ;
				end=start ;
			}
		}
		reverce(sc,start,end-1);    // for reverse last word 
		System.out.println(sc);
	}

}
