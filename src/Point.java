import java.lang.Math;

// Point class, extending Shape, represents a 2D point with x and y coordinates
public class Point extends Shape {
    int x_coor; // x-coordinate of the point
    int y_coor; // y-coordinate of the point

    // Constructor for creating a Point with specified x and y coordinates
    public Point(int x, int y) {
        x_coor = x;
        y_coor = y;
    }

    // Returns a string representation of the Point's coordinates
    public String toString() {
        return "Point:" +
                "\n  x-coordinate: " + x_coor +
                "\n  y-coordinate: " + y_coor;
    }

    // Calculates and returns the distance between the current point and another point (x2, y2)
    public double distanceTo(int x2, int y2) {
        // Uses the distance formula to calculate the distance between two points
        return Math.sqrt((x_coor - x2) * (x_coor - x2) + (y_coor - y2) * (y_coor - y2));
    }
}
