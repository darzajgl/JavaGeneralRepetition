package ClassesConstructorsInheritance;
/* You have to represent a point in 2D space. Write a class with the name Point.
The class needs two fields with name xa nd y of type int.
The class needs to have two constructors. The first constructor does not have any parameters(no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods:
1. Getters
2. Setters
3. Distance, without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
4. Distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as double.
5. Distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

 */

public class Point {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance (0,0) =" + first.distance());
        System.out.println("distance (second) = " + first.distance(second));
        System.out.println("distance (2,2) = " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point another) {
        return (distance(another.x, another.y));
    }
}
