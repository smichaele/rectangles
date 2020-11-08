import java.util.Arrays;

public class Rectangle {
    double x; //represents the x coordinate of the lower left vertex of the rectangle
    double y; //represents the y coordinate of the lower left vertex of the rectangle
    double width; //width of the rectangle
    double height; //height of the rectangle
    String color; //represents the color of the rectangle
    boolean filled; //is true if rectangle is filled, false if it is not
    
    static String[] valid_colors = {"black", "red", "green", "blue"};

    public Rectangle(double x, double y, double width, double height, String color, boolean filled) { //constructor 
    	
    	if (isValid (x, y, width, height)) {
    		this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.filled = filled;
	        
    	} else {   		
    		this.x = 0.0;
    		this.y = 0.0;
    		this.width = 0.1;
    		this.height = 0.1;
    		this.filled = false;
    	}               
    }

    
    public double getX() { //returns the x coordinate of the rectangle
        return this.x;
    }
    

    public double getY() { //returns the y coordinate of the rectangle
        return this.y;
    }
    

    public double getWidth() { //returns the width of the rectangle
        return this.width;
    }
    

    public double getHeight() { //returns the height of the rectangle
        return this.height;
    }
    
    
    public String getColor() { //returns the color of the rectangle
        return this.color;
    }
    

    public boolean isFilled() {
    	return this.filled;
    }

    
    public void setX(double x) { //sets the x coordinate of the rectangle to x
        this.x = x;
    }
    

    public void setY(double y) { //sets the y coordinate of the rectangle to y
        this.y = y;
    }
    

    public void setWidth(double w) { //sets the width of the rectangle to w
        this.width = w;
    }
    

    public void setHeight(double h) { //sets the height of the rectangle to h
        this.height = h;
    }

    public void setColor(String c) { //sets the color of the rectangle to c
        this.color = c;
    }
    
    
    public void setFill (boolean f) { //sets the filled variable to f
        this.filled = f;
    }

    
    public String toString() { //returns a String representation of the rectangle containing the values of all instance variables
        return "X: " + x + " Y: " + y + " Width: " + width + " Height: " + height + " Color: " + color + " Filled: " + filled;
    }

    // TODO public boolean equals (Rectangle rect)
    public boolean equals (Rectangle rect) {
    	return false;
    }
    
    // TODO public double computePerimeter()
    public double computePerimeter() {
    	double perimeter = 0;
    	return perimeter;
    }
    
    // TODO public double computeArea()
    public double computeArea() {
    	double area = 0;
    	return area;
    }
    
    // TODO public boolean containsPoint(double x, double y)
    public boolean containsPoint(double x, double y) {
    	return false;
    }
    
    // TODO public boolean containsRectangle(Rectangle rect)
    public boolean containsRectangle(Rectangle rect) {
    	return false;
    }
    
    // TODO public boolean intersects(Rectangle rect)
    public boolean intersects(Rectangle rect) {
    	return false;
    }
    
    
    public static boolean isValid (double x, double y, double w, double h) { //returns true if the rectangle with the lower left vertex at (x, y), width w and height h is valid
        if ((x >= 0 && x<= 1) && (y >= 0 && y <= 1) && w > 0 && h > 0 ) {
            return true;
        }

        else {
            return false; //returns false if the rectangle with the lower left vertex at (x, y), width w and height h is invalid
        }
    }
    
    
    public static boolean validColor (String color) { //returns true if the color passed to it is valid
    	if (Arrays.asList(valid_colors).contains(color)) {
    		return true;
    		
    	} else {
    		return false;
    	}
    }
}
