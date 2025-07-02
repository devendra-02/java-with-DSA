package _1apractice;

public class Snippet {
	 public static int fibonacci(int n) {
	        if (n == 0)
	            return 0;
	        else if (n == 1)
	            return 1;
	        else
	            return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	
	    // Recursive function to print Fibonacci series
	    public static void printFibonacciSeries(int n, int current) {
	        if (current >= n) {
	            return; // base case to stop
	        }
	        System.out.print(fibonacci(current) + " ");
	        printFibonacciSeries(n, current + 1); // recursive call for next index
	    }
}

