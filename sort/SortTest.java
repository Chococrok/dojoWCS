import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SortTest {
  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void testCroissant() throws Exception {
  	assertArrayEquals(new int[]{1,3,4,5,6}, Sort.croissantSort(new int[]{6,3,1,4,5}));
  }

  @Test
  public void testCroissant2() throws Exception {
  	assertTrue(Arrays.equals(null, Sort.croissantSort(null)));
  }
}

