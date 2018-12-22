
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {
	Square s = new Square(5);
	
	
	@Test
	public void testArea() {
		System.out.println("Area is: " + s.getArea());
		assertEquals(25, 5*5, s.getArea());
	}
	
	@Test
	public void testPerimeter() {
		System.out.println("Perimeter is: " + s.getPerimeter());
		assertEquals(20, 4*5, s.getPerimeter());
	}
}
