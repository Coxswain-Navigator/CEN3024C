package singlethreadTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Singlethread {
	static long starTime;
	static long enTime;
	public static void main(String args[]) {
	
		starTime = System.nanoTime();
	Integer threadArr[] = {};
	ArrayList<Integer> threadlist = new ArrayList<Integer>(Arrays.asList(threadArr));
	
	for (int i = 0; i<2000000; i++ ) {
		double arrayInput1 = ((Math.random() * (10 - 1)) +1);
		int arrayInput2 = (int) arrayInput1 + 1;
		threadlist.add(arrayInput2);
		
		threadArr = threadlist.toArray(threadArr);
		
		System.out.println(Arrays.toString(threadArr));
	}
	
	enTime = System.nanoTime();
	
	System.out.println("Time of computation: " + (enTime - starTime) + " nanoseconds.");
	
}
}