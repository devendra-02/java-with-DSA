package sring_in_java;

public class methods_imp {

	public static void main(String[] args) {
		
		// 1. indexOf() 
		
		String s = " devendra gautam ";
		System.out.println(s.indexOf('g')); // starting ke index print krega 
		System.out.println(s.lastIndexOf('a')); // last vale ka print krega 
	
		// 2. compareTO() - it is use to compare 2 string lexographically 
		
		String a = "abc";  // space ki ASCII value 32 hoti h 
		String b = "abc";
		
		System.out.println(a.compareTo(b));
		
		// 3. contains()  - inka ans true or false me aata h 
		
		String c = "virendra" ;
		System.out.println(c.contains("ren"));
		
		// 4. startsWith() / endsWith() - given input se stsrt hotra h ya nhi 
		
		System.out.println(c.startsWith("vir"));
		System.out.println(c.endsWith("vir"));
		
		// 5. toLowerCase() / toLowerCase()
		
		String d = "My Name Is Devendra Gautam" ;
		d = d.toLowerCase() ;
		System.out.println(d);
		
		System.out.println(d.toUpperCase());
		
		// 6. concat() - do string ko add kr deta h 
		
		System.out.println(b.concat(c));
		
		// 7. substring(i) - ith or  uske aage ki sari string print krta h
		
		String e = "my name is dev" ;
				System.out.println(e.substring(2));
				
		// 8. substring(i,j) print from i to j-1
				
				System.out.println(e.substring(3, 7));
				
		// 9. Integer.toString(x) - integer ko string me convert krta h 		
				
		int i = 845958 ;
		String f = Integer.toString(i) ;
		System.out.println(f.length());
		
		// 10.  .equal() - use to compare the strings 
		
		 System.out.println(d.equals(e)) ;
	}

}
