package basictest.Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {

	@Test
	public void test() {
		int a = 1;
		int b = 1;
		assertEquals(a, b);
		
//		int a[] = {1,2,3,4,5};
//		int b[] = {1,2,3,4,5,6};
//		assertArrayEquals(a, b);

//		assertTrue(false);
//		assertFalse(false);
	}
	
}
