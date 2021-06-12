package ClassesConstructorsInheritance;
/* Write a class with the name Wall. The class needs two field with name width and height of type double.
Tle class needs to have two constructors.
The first constructor does not have any parameters.
The second constructor has parameters width and height of type double and it needs to initialize the fields.
In case the width/height is less than 0 it needs to set the width/height field value to 0.
Write methods:
1. Getters
2. Setters, if parameter is less than 0 it needs to set value to 0.
3. Method named getArea without any parameters, it needs to return the area of the wall.

 */

public class Wall {

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        setHeight(height);
        setWidth(width);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getArea() {
        if (width < 0) {
            return height;
        }
        if (height < 0) {
            return width;
        } else {
            return width * height;
        }
    }
}
