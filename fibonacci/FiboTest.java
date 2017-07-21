import junit.framework.*;
import org.junit.Test;

public class FiboTest extends TestCase{
	@Test
	public void testTrue () throws Exception{
		assertEquals(true, true);
	}

	@Test
	public void testFibo0() throws Exception{
		assertEquals(0, Fibo.fibonacciIncremental(0));
	}
	
	@Test
	public void testFibo1() throws Exception{
		assertEquals(1, Fibo.fibonacciIncremental(1));
	}
	
	@Test
	public void testFibo6() throws Exception{
		assertEquals(8, Fibo.fibonacciIncremental(6));
	}
	
	@Test
	public void testFibo25() throws Exception{
		assertEquals(75025, Fibo.fibonacciIncremental(25));
	}

}
