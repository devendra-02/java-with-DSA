package recursion;
//
//public class HCF_or_greatest_common_factor {
//
//	public static void hcf(int a,int b) {      
//		if(a==0) {
//			System.out.println(b);   // hear we using a division method 
//			return ;
//		}
//		int q=a;
//		int r = b%a ;
//		hcf(r, q);
//	}
//	public static void main(String[] args) {        // do not ensue the minimum and max value before sending in function
//		int a = 90;
//		int b = 45;
//		hcf(a, b);
//	}
//
//}

//*************************************************************************************************************************************************************************************************

public class HCF_or_greatest_common_factor {
	
	public static void HCF(int a,int b,int hcf) {
		if(a%hcf==0 && b%hcf==0) {
			System.out.println("hcf is "+ hcf);   // long division method 
			return ;
		}
		HCF(a,b,hcf-1);
	}
	public static void main(String[] args) {
		int a = 90;
		int b = 100;
		HCF(Math.min(a, b), Math.max(a, b) ,Math.min(a, b));  // ensue the minimum and max value before sending in function
	}
}