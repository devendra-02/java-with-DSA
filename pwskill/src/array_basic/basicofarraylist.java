package array_basic;

import java.util.ArrayList;      // Import the ArrayList Class

public class basicofarraylist {
    public static void main(String[] args) {
    	
        // Create an ArrayList of Strings
    	// ArrayList<DataType> listName = new ArrayList<>();
    	
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Display the list
        System.out.println("Names: " + names);

        // Get an element
        System.out.println("First name: " + names.get(0));
        

        // Update an element
        names.set(1, "Bobbie");
        System.out.println("Updated Names: " + names);

        // Remove an element
        names.remove("Charlie");
        System.out.println("After removal: " + names);

        // Check the size
        System.out.println("Size of the list: " + names.size());
    }
}

//***********************************************************************************************************************************************************

//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class basicofarraylist {
//	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<Integer>(6);
//		
//		arr.add(0,10);  //  for initialize
//		arr.add(1,20); 
//		arr.add(2,30); 
//		arr.add(3,40); 
//		arr.add(4,50); 
//		arr.add(5,60); 
//		
//		System.out.println("array of size"+ arr.size());
//		
//		for(int i=0;i<arr.size();i++) {
//			System.out.print(arr.get(i)+" ");    //   arr[i]
//		}
//		
//		System.out.println();
//		arr.set(2,300);      // for modification       
//		for(int i=0;i<arr.size();i++) {
//			System.out.print(arr.get(i)+" ");    //   arr[i]
//		}
//		
////   for add new element	
//		System.out.println();
//		arr.add(80);    // for add new element
//		System.out.println("array of size"+ arr.size());
//		System.out.println(arr);
//		
////   for remove element
//		arr.remove(1);
//		System.out.println(arr);
//	}
//}

