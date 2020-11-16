import java.util.Scanner;

public class CreateRectangles {
	
	public static void main(String[]args) {
		
	    double x; //represents the x coordinate of the lower left vertex of the rectangle
	    double y; //represents the y coordinate of the lower left vertex of the rectangle
	    double width; //width of the rectangle
	    double height; //height of the rectangle
	    String color; //represents the color of the rectangle
	    String response;
	    boolean filled; //is true if rectangle is filled, false if it is not
	    
	    Scanner kbd = new Scanner(System.in);
		

		for (int i = 0; i < 2; i++) {
		 
			System.out.println("Entering parameters for rectangle " + (i + 1));
			System.out.println("===================================");
			System.out.println("Enter the x-coordinate:"); 
			x = kbd.nextDouble();
			System.out.println("Enter the y-coordinate:"); 
			y = kbd.nextDouble();
			System.out.println("Enter the width:"); 
			width = kbd.nextDouble();
			System.out.println("Enter the height:"); 
			height = kbd.nextDouble();
			kbd.nextLine();
			System.out.println("Enter the color (k=black, r=red, g=green, b=blue):");
			color = kbd.nextLine();
			 
			switch(color) {
			 
				case("k"): 
					color = "black"; 
					break;
				 
				case("b"): 
					color = "blue"; 
					break;
				 
				case("g"): 
					color = "green"; 
					break;
				 
				default: 
					color = "red"; 
					break; 
			}
			 
			System.out.println("Enter 'y' to fill the rectangle, 'n' to leave it unfilled:");
			response = kbd.nextLine(); 
			filled = response.equals(String.valueOf('y'));
			 
			// Create the object and draw it 
			Rectangle rect = new Rectangle(x, y, width, height, color, filled); 
			rect.draw();
		  
		}

		// Create rectangle for testing
		Rectangle rect = new Rectangle(0.5, 0.5, 0.2, 0.3, "green", true);
		
		// Test toString method
		System.out.println("\nTesting toString Method:");
		System.out.println("Result should be [X: 0.5 Y: 0.5 Width: 0.2 Height: 0.3 Color: green Filled: true]");
		System.out.println(rect.toString());
		
		// Test setters
		System.out.println("\nTesting Setter Methods:");
		System.out.println("X is being set to 1.0.");
		System.out.println("Y is being set to 1.0.");
		System.out.println("Width is being set to 1.0.");
		System.out.println("Height is being set to 1.0.");			
		System.out.println("Color is being set to blue.");
		System.out.println("Fill is being set to false.");
		rect.setX(1.0);
		rect.setY(1.0);
		rect.setWidth(1.0);
		rect.setHeight(1.0);
		rect.setColor("blue");
		rect.setFill(false);
		
		
		// Test getters
		System.out.println("\nTesting Getter Methods (should be same values as above):");
		System.out.println("X: " + rect.getX());
		System.out.println("Y: " + rect.getY());
		System.out.println("Width: " + rect.getWidth());
		System.out.println("Height: " + rect.getHeight());			
		System.out.println("Color: " + rect.getColor());
		System.out.println("Fill: " + rect.isFilled());
		
		// Test computePerimeter and computeArea methods
		System.out.println("\nTesting computePerimeter and computeArea Methods (P = 2.0, A = 1.0):");
		System.out.println("Perimeter: " + rect.computePerimeter());
		System.out.println("Area: " + rect.computeArea());
		
		// Test equals method
		System.out.println("\nTesting equals Method:");
		Rectangle rect2 = new Rectangle(1.0, 1.0, 1.0, 1.0, "blue", false);
		System.out.println("These rectangles should be equal, i.e. true: " + rect.equals(rect2));
		Rectangle rect3 = new Rectangle(1.0, 1.0, 1.0, 1.0, "red", false);
		System.out.println("These rectangles should NOT be equal, i.e. false: " + rect.equals(rect3));
		
		// Test containsRectangle method
		System.out.println("\nTesting containsRectangle Method:");
		Rectangle rect4 = new Rectangle(0.5, 0.5, 0.2, 0.3, "blue", false);
		Rectangle rect5 = new Rectangle(0.5, 0.5, 0.1, 0.1, "red", true);
		Rectangle rect6 = new Rectangle(0.5, 0.5, 0.3, 0.2, "green", false);
		System.out.println("Rect4 should contain Rect5 - this should be true: " + rect4.containsRectangle(rect5));
		System.out.println("Rect4 should NOT contain Rect6 - this should be false: " + rect4.containsRectangle(rect6));
		
		// Test containsPoint method
		System.out.println("\nTesting containsPoint Method");
		System.out.println("Rect4 should contain point (0.45, 0.60) - this should be true: " + rect4.containsPoint(0.45, 0.60));
		System.out.println("Rect4 should NOT contain point (0.30, 0.20) - this should be false: " + rect4.containsPoint(0.30, 0.20));
		
		// Test intersects method
		System.out.println("\nTesting intersects Method");
		Rectangle rect7 = new Rectangle(0.1, 0.1, 0.1, 0.1, "black", false);
		System.out.println("Rect4 should intersect Rect6 - this should be true: " + rect4.intersects(rect6));
		System.out.println("Rect6 should intersect Rect4 - this should be true: " + rect6.intersects(rect4));
		System.out.println("Rect4 should NOT intersect Rect7 - this should be false: " + rect4.intersects(rect7));
		
		kbd.close();
	}
}
