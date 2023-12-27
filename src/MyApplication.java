import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a Shape object to store points and perform geometric calculations
        Shape shape = new Shape();

        // Open a file containing coordinate values
        File coordinatesFile = new File("C:\\Users\\Asus\\IdeaProjects\\untitled4\\src\\coordinates");
        Scanner scanner = new Scanner(coordinatesFile);

        // Read and store coordinates for 10 points from the file
        Point point1 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point2 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point3 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point4 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point5 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point6 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point7 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point8 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point9 = new Point(scanner.nextInt(), scanner.nextInt());
        Point point10 = new Point(scanner.nextInt(), scanner.nextInt());

        // Add the points to the Shape object
        shape.addPoint(point1);
        shape.addPoint(point2);
        shape.addPoint(point3);
        shape.addPoint(point4);
        shape.addPoint(point5);
        shape.addPoint(point6);
        shape.addPoint(point7);
        shape.addPoint(point8);
        shape.addPoint(point9);
        shape.addPoint(point10);

        // Calculate and display the distance between point6 and point7
        System.out.println(point6.distanceTo(point7.x_coor, point7.y_coor));

        // Display the string representation of point5
        System.out.println(point5.toString());

        // Calculate and display the perimeter of the shape
        System.out.println(shape.perimeter());

        // Display the length of the longest side in the shape
        System.out.println(shape.longestSide());

        // Display the average length of the sides in the shape
        System.out.println(shape.averageSide());
    }
}
