import junit.framework.*;
import org.junit.Test;

public class MonsterTest extends TestCase{
	@Test
	public void testTrue () throws Exception{
		assertEquals(true, true);
	}

	@Test
	public void testName () throws Exception{
		Monster mat = new Monster("mat", 1, 2 ,3);
		assertEquals("mat", mat.getName());
	}

	@Test
	public void testLife () throws Exception{
		Monster mat = new Monster("mat", 1, 2 ,3);
		assertEquals(1, mat.getLife());
	}

	@Test
	public void testPower () throws Exception{
		Monster mat = new Monster("mat", 1, 2 ,3);
		assertEquals(2, mat.getPower());
	}
	@Test
	public void testSpeed () throws Exception{
		Monster mat = new Monster("mat", 1, 2 ,3);
		assertEquals(3, mat.getSpeed());
	}

}
