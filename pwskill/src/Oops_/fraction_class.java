package Oops_;

public class fraction_class {
	
	public static fraction add(fraction f1 , fraction f2) {
		int numerater = f1.num*f2.den + f2.num*f1.den ;
		int denomineter = f1.den*f2.den ;
		fraction f3 = new fraction(numerater , denomineter) ;
		return f3 ;
	}
	
	public static int gcd(int num ,int den) {
		int min = Math.min(num, den);
		for(int i=min;i>=1;i--) {
			if(num%i==0 && den%i==0) {
				return i;
			}
		}
		return 1 ;
	}
	public static class fraction{
		int num ;
		int den ;
		public fraction(int num ,int den) {    // this is constructor 
			this.num = num ;
			this.den = den ;
			simplify();
		}
		public void simplify() {    // this is function 
			int hcf = gcd(num , den) ;
			num /= hcf ;
			den /= hcf ;
		}
	}
	public static void main(String[] args) {
		fraction f1 = new fraction(35 , 21);   // f1, f2, and f3 are objects (instances) of this class.
		System.out.println(f1.num+"/"+f1.den);
		fraction f2 = new fraction(7 , 3) ;  // The method add(f1, f2) is used to add two fractions.
		System.out.println(f2.num+"/"+f2.den);
		fraction f3 = add(f1,f2);
		System.out.println(f3.num+"/"+f3.den);
	}
}
