import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}
	
	public final void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator ();
		
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	

}
