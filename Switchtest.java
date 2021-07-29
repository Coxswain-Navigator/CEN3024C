package application;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author adama
 *Implementation of Junit.
 */
public class Switchtest {
	

	/**
	 * Tests the swtich statement used in main.java
	 */
	@Test
	public void test() {
		
		int num = 9;
		String resultletter = "error";
        switch (num) {
		case 0 :
			resultletter = "error"; 
			break;
		case 9 :
			resultletter = "soul";
			break;

		}
        if (resultletter.equals("error") == true)
        	{
		fail("Junit test failed.");
        	}
        else {
        	
        }
	}

}
