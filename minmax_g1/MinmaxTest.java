import junit.framework.*;
import org.junit.Test;
import java.util.*;

public class MinmaxTest extends TestCase {
  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void testInt() throws Exception {
  	int[] bibi = new int[]{1,30,20,50,2,100};
  	int[] result = new int[]{1,100};
  	assertEquals(new Pair(result[0], result[1]), Calc.minmax(bibi));
  }
  public void testInt1() throws Exception {
  	int[] bibi = new int[]{4,30,20,50,2,600};
  	int[] result = new int[]{2,600};
  	assertEquals(new Pair(result[0], result[1]), Calc.minmax(bibi));
  }
  public void testInt2() throws Exception {
  	int[] bibi = new int[]{6,30,20,50,12,4,-6,430};
  	int[] result = new int[]{-6,430};
  	assertEquals(new Pair(result[0], result[1]), Calc.minmax(bibi));
  }
  @Test
  public void testEmpty() throws Exception {
  	int[] bibi = new int[]{};
  	int[] result = new int[]{0,0};
  	assertEquals(new Pair(result[0], result[1]), Calc.minmax(bibi));
  }
}

