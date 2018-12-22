
import static org.junit.Assert.*;
import org.junit.Test;



public class CircleTest {
	Circle c = new Circle(6);
	
	@Test
	public void testArea() {
		System.out.println("Area is: " + c.getArea());
        assertEquals(113.0399999999, c.getArea(),0.001);
		
	}
	
	@Test
	public void testPerimeter() {
		System.out.println("Perimeter is: " + c.getPerimeter());
        assertEquals(18.85, c.getPerimeter(),0.001);
	}
}