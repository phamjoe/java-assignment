
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
	Triangle t = new Triangle(4,5,7);
	

	@Test
	public void testArea() {
		System.out.println("Area is: " + t.getArea());
		assertEquals(4, (1+3+5)/2, t.getArea());
	}
	
	@Test
	public void testPerimeter() {
		System.out.println("Perimeter is: " + t.getPerimeter());
		assertEquals(18, 1+3+5, t.getPerimeter());
	}
}
