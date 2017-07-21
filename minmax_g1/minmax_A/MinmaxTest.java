import junit.framework.*;
import org.junit.Test;

public class MinmaxTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	
	@Test
	public void test1() throws Exception {
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		Minmax mm = new Minmax(tab);
		assertEquals(new Minmax(new int[] {1, 10}), mm.minmax());
	}
	
	@Test
	public void test2() throws Exception {
		int[] tab = {10, -2, -3, -4, -5, -6, -7, -8 , -9, -10};
		Minmax mm = new Minmax(tab);
		assertEquals(new Minmax(new int[] {-10, 10}), mm.minmax());
	}
	
	@Test
	public void test3() throws Exception {
		int[] tab = {10000, 0, 0, 0, 0, 0, 0, 8, 9, 0};
		Minmax mm = new Minmax(tab);
		assertEquals(new Minmax(new int[] {0, 10000}), mm.minmax());
	}
}
