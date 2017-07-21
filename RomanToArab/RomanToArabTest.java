import junit.framework.*;
import org.junit.Test;

public class RomanToArabTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals (true,true);
	}
	@Test
	public void testSix() throws Exception {
		assertEquals (6, RomanToArabV2.convert("VI"));
	}
	@Test
	public void testEleven() throws Exception {
		assertEquals (11, RomanToArabV2.convert("XI"));
	}

	@Test
	public void testAll() throws Exception {
		assertEquals (1666, RomanToArabV2.convert("MDCLXVI"));
	}
	@Test
	public void testFour() throws Exception {
		assertEquals (4, RomanToArabV2.convert("IV"));
	}
	@Test
	public void testNine() throws Exception {
		assertEquals (9, RomanToArabV2.convert("IX"));
	}
	@Test
	public void testFive() throws Exception {
		assertEquals (5, RomanToArabV2.convert("V"));
	}

}
