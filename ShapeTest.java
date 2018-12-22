import org.junit.runner.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class ShapeTest {
	public static void main(String[] args) {
		
		Result circle = JUnitCore.runClasses(CircleTest.class);
		System.out.print("\n\nThe Circle Test Results ");
		for (Failure failure : circle.getFailures())
		System.out.println(failure);
		if (circle.wasSuccessful())
		System.out.println("Tests finished successfully !");
		
		Result parallelogram = JUnitCore.runClasses(ParallelogramTest.class);
		System.out.print("\n\nThe Parallelogram Test Results ");
		for (Failure failure : parallelogram.getFailures())
		System.out.println(failure);
		if (parallelogram.wasSuccessful())
		System.out.println("Tests finished successfully !");
		
		Result square = JUnitCore.runClasses(SquareTest.class);
		System.out.print("\n\nThe Square Test Results ");
		for (Failure failure : square.getFailures())
		System.out.println(failure);
		if (square.wasSuccessful())
		System.out.println("Tests finished successfully !");
		
		Result rectangle = JUnitCore.runClasses(RectangleTest.class);
		System.out.print("\n\nThe Rectangle Test Results ");
		for (Failure failure : rectangle.getFailures())
		System.out.println(failure);
		if (rectangle.wasSuccessful())
		System.out.println("Tests finished successfully !");
		
		Result triangle = JUnitCore.runClasses(TriangleTest.class);
		System.out.print("\n\nThe Triangle Test Results ");
		for (Failure failure : triangle.getFailures())
		System.out.println(failure);
		if (triangle.wasSuccessful())
		System.out.println("Tests finished successfully !");
	}
}