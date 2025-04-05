package Oops_;
public class Student_class {
	
	public static void main(String[] args) {
//		student dev = new student() ;
//		dev.name = "devendra" ;
////		dev.rollno = 54 ;    // we can not excess this because this is private in student class 
//		dev.persentage =75.4 ; //  this is default access in same class,package
//		System.out.println(dev .name); 
//		System.out.println(dev .persentage);
//		
//		System.out.println("using getter we read private value "+dev.getrollno());
//		dev.setrollno(54);
//		System.out.println("using setter we  set new value "+dev.getrollno());
		
		
		student bhoi = new student("piyush" ,45 , 92.4) ;  // constructor
		System.out.println(bhoi.name);
//		System.out.println(bhoi.rollno);  // private class 
		System.out.println(bhoi.persentage);
		
		student singh = new student("hitesh" ,55 , 82.4) ;  // constructor 2
		System.out.println(singh.name);
//		System.out.println(singh.rollno);  // private class 
		System.out.println(singh.persentage);
	}
}
