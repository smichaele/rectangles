import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void creatingRectangleWithInvalidValuesShouldReturnDefaults() {
		
		Rectangle rect1 = new Rectangle(10, 0.9, 0.9, 0.9, "green", true);
		assertEquals(0.0, rect1.getX(), 1);
		assertEquals(0.0, rect1.getY(), 1);
		assertEquals(0.1, rect1.getWidth(), 1);
		assertEquals(0.1, rect1.getHeight(), 1);
		assertEquals("green", rect1.getColor());
		assertFalse(rect1.isFilled());
	}
	
	@Test
	void creatingRectangleWithInvalidColorShouldReturnColorRed() {
		
		Rectangle rect1 = new Rectangle(0.9, 0.9, 0.9, 0.9, "cyan", true);
		assertEquals("red", rect1.getColor());
	}
	
	@Test
	void comparingRectanglesWithSameParametersShouldBeTrue() {
		
		Rectangle rect1 = new Rectangle(0.9, 0.9, 0.9, 0.9, "green", true);
		Rectangle rect2 = new Rectangle(0.9, 0.9, 0.9, 0.9, "green", true);
		assertTrue(rect1.equals(rect2));
	}
	
	@Test
	void comparingRectanglesWithDifferentParametersShouldBeFalse() {
		
		Rectangle rect1 = new Rectangle(0.9, 0.9, 0.9, 0.9, "green", true);
		Rectangle rect2 = new Rectangle(0.9, 0.9, 0.9, 0.9, "red", true);
		assertFalse(rect1.equals(rect2));
	}
	
	@Test
	void computingPerimeterOfRectangleShouldBeTwoXHeightXWidth() {
		
		Rectangle rect1 = new Rectangle(0.9, 0.9, 0.9, 0.9, "green", true);
		Rectangle rect2 = new Rectangle(0.9, 0.9, 0.6, 0.5, "red", true);
		assertEquals(1.62,rect1.computePerimeter(), 2);
		assertEquals(0.6,rect2.computePerimeter(), 1);
	}
	
	@Test
	void computingAreaOfRectangleShouldBeHeightXWidth() {
		
		Rectangle rect1 = new Rectangle(0.9, 0.9, 0.9, 0.9, "green", true);
		Rectangle rect2 = new Rectangle(0.9, 0.9, 0.9, 0.9, "red", true);
		assertEquals(0.81,rect1.computeArea(), 2);
		assertEquals(0.3,rect2.computeArea(), 1);
	}
	
	@Test
	void checkingIfRectAContainsRectB() {
		
		Rectangle rect4 = new Rectangle(0.5, 0.5, 0.2, 0.3, "blue", false);
		Rectangle rect5 = new Rectangle(0.5, 0.5, 0.1, 0.1, "red", true);
		Rectangle rect6 = new Rectangle(0.5, 0.5, 0.3, 0.2, "green", false);
		assertTrue(rect4.containsRectangle(rect5));
		assertFalse(rect4.containsRectangle(rect6));
	}
	
	@Test
	void checkingIfRectAContainsPointXCommaY() {
		
		Rectangle rect4 = new Rectangle(0.5, 0.5, 0.2, 0.3, "blue", false);
		assertTrue(rect4.containsPoint(0.45, 0.60));
		assertFalse(rect4.containsPoint(0.30, 0.20));
		
	}
	
	@Test
	void checkingIfRectAIntersectsWithRectB() {
		
		Rectangle rect4 = new Rectangle(0.5, 0.5, 0.2, 0.3, "blue", false);
		Rectangle rect6 = new Rectangle(0.5, 0.5, 0.3, 0.2, "green", false);
		Rectangle rect7 = new Rectangle(0.1, 0.1, 0.1, 0.1, "black", false);
		assertTrue(rect4.intersects(rect6));
		assertTrue(rect6.intersects(rect4));
		assertFalse(rect4.intersects(rect7));
	}

}
