package Oops_;

class Example {
    static int count = 0;  // Shared by all objects
    
    Example() {
        count++;
        System.out.println("Count: " + count);
    }
}
public class Static_keyword {
	 public static void main(String[] args) {
	        Example obj1 = new Example();
	        Example obj2 = new Example();
	        Example obj3 = new Example();
	    }
}
