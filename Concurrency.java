package concurrencyProject;

/*
 * Adam Hunt 7/4/21
 * 
 * After doing some research, 8 threads seems to be the good middle ground for this test.
 */

class ConcurrencyDemo implements Runnable {
	
		   private Thread t;
		   private String threadName;
		   int[] threadarr = new int[2000000];
		   //CopyOnWriteArrayList[] threadSafeList = new CopyOnWriteArrayList[]();
		   int count = 0;
		   
		   ConcurrencyDemo( String name) {
		      threadName = name;
		      System.out.println("Creating " +  threadName );
		   }
		   
		   public void run() {
		      System.out.println("Running " +  threadName );
		      try {
		         for(int i = 4/*threadarr.length / 8*/; i > 0; i--) {
		        	count++;
		            System.out.println("Thread: " + threadName + ", " + i + " " + count);
		            // Let the thread sleep for a while
		            threadarr[i] = (int) ((Math.random() * (10 - 1)) +1);
		            Thread.sleep(25);
		         }
		         
		      } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		      }
		      System.out.println("Thread " +  threadName + " exiting.");
		      System.out.println(threadarr.toString());
		   }
		   
		   public void start () {
		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
		}

		public class Concurrency {

		   public static void main(String args[]) {
			   ConcurrencyDemo R1 = new ConcurrencyDemo( "Thread-1");
		      R1.start();
		      
		      ConcurrencyDemo R2 = new ConcurrencyDemo( "Thread-2");
		      R2.start();
		      ConcurrencyDemo R3 = new ConcurrencyDemo( "Thread-3");
		      R3.start();
		      
		      ConcurrencyDemo R4 = new ConcurrencyDemo( "Thread-4");
		      R4.start();
		      
		      ConcurrencyDemo R5 = new ConcurrencyDemo( "Thread-5");
		      R5.start();
		      
		      ConcurrencyDemo R6 = new ConcurrencyDemo( "Thread-6");
		      R6.start();
		      
		      ConcurrencyDemo R7 = new ConcurrencyDemo( "Thread-7");
		      R7.start();
		      
		      ConcurrencyDemo R8 = new ConcurrencyDemo( "Thread-8");
		      R8.start();
		   } 
		   
		}
