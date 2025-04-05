package sring_in_java;

public class update {

	public static void main(String[] args) {
		
		String s = "hellow devendra" ;
		String t = "" ;
		
		for(int i=0;i<s.length();i++) {
			if(i%2==0) t += 'a';
			else t+= s.charAt(i);
			}
		System.out.println(t);

	}

}
