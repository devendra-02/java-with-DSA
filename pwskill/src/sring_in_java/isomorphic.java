package sring_in_java;

public class isomorphic {
	public static void main(String[] args) {
//		String t = "race" ;
//		String s = "mood" ;
		
		String s = "race" ;
		String t = "mood" ;
		
		char[] a = new char[128] ;
		for(int i=0;i<s.length();i++) {
			char cs = s.charAt(i) ;
			char ct = t.charAt(i) ;
			int idxs = (int)cs ;
			
			if(a[idxs]=='\0') a[idxs] = ct ;
			else if(a[idxs]!=ct) { 
				System.out.println("not isomorphic");
				return ;}
		}
		
		for(int i=0;i<a.length;i++) {
			a[i]=0 ;
		}
		for(int i=0;i<s.length();i++) {
			char cs = s.charAt(i) ;
			char ct = t.charAt(i) ;
			int idxt = (int)ct ;
			
			if(a[idxt]=='\0') a[idxt] = cs ;
			else if(a[idxt]!=cs) { 
				System.out.println("not isomorphic");
				return ;}
		}
		System.out.println("isomorphic");
	}
}
