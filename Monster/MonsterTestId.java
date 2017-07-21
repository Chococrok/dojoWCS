import junit.framework.*;
import org.junit.Test;

public class MonsterTestId extends TestCase{
	@Test
	public void testTrue () throws Exception{
		assertEquals(true, true);
	}

	@Test
	public void testId () throws Exception{
		Monster mat = new Monster("mat", 1, 2 ,3);
		Monster nat = new Monster("mat", 1, 2 ,3);
		Monster lat = new Monster("mat", 1, 2 ,3);
		assertEquals(1, mat.getId());
		assertEquals(2, nat.getId());
		assertEquals(3, lat.getId());
	}

}
