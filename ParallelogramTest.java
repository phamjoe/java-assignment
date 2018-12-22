
import static org.junit.Assert.*;
import org.junit.Test;

public class ParallelogramTest {
	
	Parallelogram p = new Parallelogram(6, 7, 4);

	
	@Test
	public void testeArea() {
		System.out.println("Area is: " + p.getArea());
		assertEquals(18, 3*1, p.getArea());
	}
	
	@Test
	public void testPerimeter() {
		System.out.println("Perimeter is: " + p.getPerimeter());
		assertEquals(16, 2*3+2*5, p.getPerimeter());
	}
}