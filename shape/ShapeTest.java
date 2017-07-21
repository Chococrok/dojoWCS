import junit.framework.*;
import org.junit.Test;
import java.lang.*;

public class ShapeTest extends TestCase {

	@Test
		public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testRectangle() throws Exception {
		Rectangle test = new Rectangle(1,2,3,4);  
		assertEquals(1, test.getX());
		assertEquals(2, test.getY());
		assertEquals(3, test.getHeight());
		assertEquals(4, test.getWidth());
	}

	@Test
	public void testRectangleAreaPerimeter() throws Exception {
		Rectangle test = new Rectangle(1,2,3,5);
		assertEquals(16, (int)test.getPerimeter());
		assertEquals(15, (int)test.getArea());
	}

	@Test
	public void testCircle() throws Exception {
		Circle test = new Circle(1,2,3);
		assertEquals(1, test.getX());
		assertEquals(2, test.getY());
		assertEquals(2*Math.PI*3, test.getPerimeter());
		assertEquals(Math.PI*9, test.getArea());
	}

	@Test
	public void testDrawRectangle() throws Exception {
		Canvas c = new Canvas(50, 100);
		Rectangle rectangle = new Rectangle(25,4,5,7);
		rectangle.draw(c, true);

		Rectangle small = new Rectangle(2,20,3,4);
		small.draw(c, false);
	
		Rectangle big = new Rectangle(10,2,7,4);
		big.draw(c, false);
		
		Shape circle = new Circle(15, 10, 15);
		circle.draw(c, true);
		c.dump();
	}

	@Test
	public void testDrawCircle() throws Exception {
	

	}	
}

