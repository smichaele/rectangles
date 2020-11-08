import java.util.ArrayList;
import java.util.Random;
public class RectangleTester {
    public static void main(String[]args) { //prints all rectangles and then prints the left-most rectangle

        ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>(); //creates 10 random rectangles and add them to an array list
        Random rand = new Random();

        double minimum = 1;
        int leftRect = 0;

        for (int i = 0; i < 10; i++) {
            double randomWidth= 0;
            randomWidth = 10 * rand.nextInt(10) + 1;

            double randomHeight = 0;
            randomHeight = 10 * rand.nextInt(10) + 1;

            double randomX = 0;
            randomX = rand.nextDouble();

            double randomY = 0;
            randomY = rand.nextDouble();

            String randomColor = "red";
            boolean randomFill = true;
            

            if (randomX < minimum) {
                minimum = randomX;
                leftRect = i;
            }

            Rectangle rect = new Rectangle(randomX, randomY, randomHeight, randomWidth, randomColor, randomFill);
            rectangleList.add(rect);
        }

        for (int i = 0; i < 10; i++) { //prints the 10 random rectangles
            System.out.println("\nRectangle: " + (i + 1) + "\n" + rectangleList.get(i));
        }

        System.out.println("\nLeftmost Rectangle: Rectangle " + (leftRect + 1) + "\n" + rectangleList.get(leftRect)); //prints which rectangle is left-most

        
    }
}