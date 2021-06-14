package fibonaccifunction;

import java.util.Scanner;
	/* 
	 * Adam Hunt
	 * 6/13/2021
	 * Module 5 documentation assignment
	 * Implements the fibonacci function iteratively and recursively and calculates the runtime efficiency.
	 */

public class Fibomain {
	
	//Timer for calculation
	static long starTime;
	static long endTime;
	
	public static int factorial (int n, long num1, long num2, long num3) {
		//Actually runs the calculation, the resulting numbers are not printed, however.
		if (n == 0) {
			return n;
		}
		else {
		num3 = num1;
		num1 += num2;
		num2 = num3;
		return n*factorial(n-1, num1, num2, num3);
	}
	}

	public static void main(String[] args) {
		
		
		
		@SuppressWarnings("resource") //I don't know why its giving me a warning for this scanner since I close it later
		Scanner scnr = new Scanner(System.in);
		
		//These 3 numbers are the primary elements of the fibonacci sequence. Each number in the sequence is the sum of the two preceding numbers.
		long num1 = 0;
		long num2 = 1;
		long num3 = 0;
		int i;
		
		//Prints out readable text for the viewer.
		System.out.println("Please input the number of iterations of which you would like to run the fibonacci sequence.");
		
		//The number of iterations of the fibonacci sequence that the viewer wants to run are decided here.
		int iter = scnr.nextInt();
		
		//Begins calculating nanotime for the for loop
		starTime = System.nanoTime();
		//Actually runs the calculation iteratively, the resulting numbers are not printed, however.
		for (i = 0; i < iter; i++) {
			num3 = num1;
			num1 += num2;
			num2 = num3;
		}
		
		//Records nanotime at the end of the for loop
		endTime = System.nanoTime();
		
		//Output the resulting fibonacci loop's runtime
		System.out.println("Beginning iteritive runtime calculation");
		System.out.println("Beginning time " + starTime);
		System.out.println("Ending time " + endTime);
		System.out.print("Length in nanoseconds ");
		System.out.println(endTime - starTime);
		
		//Resets numbers to original values.
		num1 = 0;
		num2 = 1;
		num3 = 0;
		
		//Begins calculating nanotime for the method
		starTime = System.nanoTime();
		
		//Actually runs the calculation recursively, like the last time the numbers are not printed.
		factorial(i, num1, num2, num3);
		
		//Records nanotime at the end of the factorial method
		endTime = System.nanoTime();
		
		//Output the resulting fibonacci method's runtime
		System.out.println("Beginning recursive runtime calculation");
		System.out.println("Beginning time " + starTime);
		System.out.println("Ending time " + endTime);
		System.out.print("Length in nanoseconds ");
		System.out.println(endTime - starTime);
		
		//Closes the scanner from earlier
		scnr.close();

	}

}
