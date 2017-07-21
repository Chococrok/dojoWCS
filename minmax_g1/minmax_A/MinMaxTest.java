import junit.framework.*;
import org.junit.Test;
import java.util.*;

public class MinMaxTest extends TestCase {
	@Test
	public void testTrue() throws Exception{
		assertEquals(true,true);	
	}
	@Test
	public void testA() throws Exception{
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(new Pair( tab[0],tab[9]), MinMax.minMax(tab));	
	}
	@Test
	public void testB() throws Exception{
		int[] tab = {10,100,1000,1000,1000000};
		assertEquals(new Pair( tab[0],tab[4]), MinMax.minMax(tab));	
	}
	@Test
	public void testC() throws Exception{
		int[] tab = {-10,-100,-1000,-1000,-1000000};
		assertEquals(new Pair( tab[4],tab[0]), MinMax.minMax(tab));	
	}
	@Test
	public void testD() throws Exception{
		int[] tab = {};
		assertEquals(new Pair(0,0), MinMax.minMax(tab));	
	}

	
}
