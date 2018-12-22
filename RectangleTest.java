
import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest {
	Rectangle r = new Rectangle(12, 3);

	
	@Test
	public void testArea() {
		System.out.println("Area is: " + r.getArea());
		assertEquals(30, 12*3, r.getArea());
	}
	
	@Test
	public void testPerimeter() {
		System.out.println("Perimeter is: " + r.getPerimeter());
		assertEquals(36, 2*12+2*3, r.getPerimeter());
	}
}