import java.util.ArrayList;

// The Shape class represents a geometric shape defined by a list of points
public class Shape {
    private ArrayList<Point> pointsArrayList;

    // Constructor initializes the ArrayList to store points
    public Shape() {
        pointsArrayList = new ArrayList<Point>(); // Initialize the array to store points
    }

    // Adds a Point object to the list of points in the shape
    public void addPoint(Point point) {
        pointsArrayList.add(point);
    }

    int i = 0;
    double perimeter = 0;

    // Calculates and returns the perimeter of the shape
    public double perimeter() {
        while (i < 9) {
            perimeter += pointsArrayList.get(i).distanceTo(pointsArrayList.get(i + 1).x_coor, pointsArrayList.get(i + 1).y_coor);
            i++;
        }
        return perimeter + pointsArrayList.get(9).distanceTo(pointsArrayList.get(0).x_coor, pointsArrayList.get(0).y_coor);
    }

    int j = 0;
    double maxDistance = 0;

    // Finds and returns the length of the longest side in the shape
    public double longestSide() {
        while (j < 9) {
            double currentDistance = pointsArrayList.get(j).distanceTo(pointsArrayList.get(j + 1).x_coor, pointsArrayList.get(j + 1).y_coor);
            if (maxDistance < currentDistance) {
                maxDistance = currentDistance;
            }
            j++;
        }

        return ((pointsArrayList.get(9).distanceTo(pointsArrayList.get(0).x_coor, pointsArrayList.get(0).y_coor) > maxDistance) ?
                pointsArrayList.get(9).distanceTo(pointsArrayList.get(0).x_coor, pointsArrayList.get(0).y_coor) : maxDistance);
    }

    // Calculates and returns the average length of the sides in the shape
    public double averageSide() {
        return perimeter() / 10;
    }
}

