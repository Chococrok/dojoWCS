import junit.framework.*;
import org.junit.Test;

public class SlugTest extends TestCase{
	@Test
	public void testTrue() throws Exception{
		assertEquals(true,true);
	}
	@Test
	public void testA() throws Exception{
		assertEquals("jeanjean",Slug.slug("jeanjean"));
	}
	@Test
	public void testB() throws Exception{
		assertEquals("jean-jean",Slug.slug("jean jean"));
	}
	@Test
	public void testC() throws Exception{
		assertEquals("jeanjean",Slug.slug("JeanJean"));
	}

}
