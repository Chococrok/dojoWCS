import junit.framework.*;
import org.junit.Test;

public class FizzbuzzTest extends TestCase {
	@Test
	public void testTrue() throws Exception{
		assertEquals(true, true);
	}
	
	@Test
	public void testFizz() throws Exception{
		assertEquals("fizz", Fizzbuzz.fizzbuzz(3));
		assertEquals("fizz", Fizzbuzz.fizzbuzz(9));
		assertEquals("fizz", Fizzbuzz.fizzbuzz(18));
	}
	
	@Test
	public void testBuzz() throws Exception{
		assertEquals("buzz", Fizzbuzz.fizzbuzz(5));
		assertEquals("buzz", Fizzbuzz.fizzbuzz(10));
		assertEquals("buzz", Fizzbuzz.fizzbuzz(25));
	}
	
	@Test
	public void testFizzbuzz() throws Exception{
		assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(15));
		assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(30));
		assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(150));
	}
	
	@Test
	public void testError() throws Exception{
		assertEquals("error", Fizzbuzz.fizzbuzz(1));
		assertEquals("error", Fizzbuzz.fizzbuzz(2));
		assertEquals("error", Fizzbuzz.fizzbuzz(-1));
	}
}
