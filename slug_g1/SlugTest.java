import junit.framework.*;
import org.junit.Test;

public class SlugTest extends TestCase {
  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);

  }
  @Test 
  public void testLowerCase() throws Exception{
  	assertEquals("benjamin",Slug.slugify("benjamin"));

    String titi = "titi titi";
    System.out.println("titi = " + titi);
    titi = Slug.slugify(titi);
    System.out.println("titi = " + titi);
    //System.out.println("toto = " + toto);
  }
  @Test 
  public void testEsp() throws Exception{
  	assertEquals("ben-jamin",Slug.slugify("ben jamin"));
  }
  @Test 
  public void testMaj() throws Exception{
  	assertEquals("benjamin",Slug.slugify("Benjamin"));
  }
}

