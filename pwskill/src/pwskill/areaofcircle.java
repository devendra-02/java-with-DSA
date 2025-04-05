package pwskill;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// with taking input from user 		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a radius ");
		double a ,r = sc.nextDouble();
		a = 3.141592 * r * r ;
		System.out.println("area of circle of "+ r+ " is " + a );
		
//		double r = 3.7, a ;
//		a = 3.141592 * r * r ;
//		System.out.println("area of circle of "+ r+ " is " + a );
	}

}
