import junit.framework.*;
import org.junit.Test;

public class MinorCaseTest extends TestCase {
	@Test
	public void testTrue() throws Exception{
		assertEquals(true, true);
	}
	@Test
	public void testMinor() throws Exception{
		int[] people = new int[] {1, 3, 45, 69, 345, 18, 17, 12};
		assertEquals(4, MinorCase.minorNumber(people)); 
	}
}
