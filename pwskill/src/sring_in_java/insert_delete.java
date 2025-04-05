package sring_in_java;

public class insert_delete {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("devendra") ;
		System.out.println(s);
		
		// delete 
		s.deleteCharAt(5);
		System.out.println(s);
		s.append("gautam");
		System.out.println(s);
		s.delete(3, 7);  // delete perticular range
		System.out.println(s);
		
		// insert value change ni krta do ke bich me insert krta h 
		s.insert(3,'e');
		System.out.println(s);
		s.insert(4,"ndra");
		System.out.println(s);
	}

}
