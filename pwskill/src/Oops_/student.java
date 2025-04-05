package Oops_;

public class student {
		public String name ; // accessible in same class,package,subclass,other package 
		private int rollno = 96 ; // accessible only in same class 
		double persentage ;  // this is default access in same class,package

		public int getrollno() {  // getter - only use for reading 
			return rollno ;
		}
		public void setrollno(int Rno) { // setter - only for writing 
			rollno = Rno ;
		}
		
		public student (String name ,int rollno , Double persentage) {   // not necessary to use all attributes example niche vala
//			public student (String naaame ,int rollnoooo ) {
			this.name = name;
			this.rollno = rollno;
			this.persentage = persentage;
		}
}
