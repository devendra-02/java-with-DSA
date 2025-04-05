package array_basic;

public class no_of_student_unable_to_eat_lunch_1700 {

	    public static int countStudents(int[] students, int[] sandwiches) {
	        int count0 = 0, count1 = 0;

	        // Count the number of students preferring 0 and 1
	        for (int student : students) {
	            if (student == 0) count0++;
	            else count1++;
	        }
	        
	        // Process the sandwiches stack
	        for (int sandwich : sandwiches) {
	            if (sandwich == 0 && count0 > 0) {
	                count0--;
	            } else if (sandwich == 1 && count1 > 0) {
	                count1--;
	            } else {
	                break; // * important * No student can take the current sandwich
	            }
	        }

	        return count0 + count1; // Remaining students who couldn't eat
	    }

	public static void main(String[] args) {
		int[] students = {0,0,0,1,0,1,1,1,1,0,1};
        int[] sandwiches = {0,0,0,1,0,0,0,0,0,1,0};
        System.out.println("no of student unable to eat "+countStudents(students, sandwiches)); // Output: 5
    }

}
