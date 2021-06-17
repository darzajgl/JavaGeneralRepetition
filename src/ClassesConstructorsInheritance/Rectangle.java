package ClassesConstructorsInheritance;
/* Write a class with the name Rectangle. The class needs two fields with name width and length both of type double.
The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
In case the width/length is less than o it needs to set the width/length field value to 0.
Write the following methods:
1. getWidth
2. getLength
3. getArea without any parameters, it needs to return the calculated area
 */

import ExpressionsStatementsCodeBlocksMethods.AreaCalculator;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width = "+ rectangle.getWidth());
        System.out.println("rectangle.length = "+rectangle.getLength());
        System.out.println("rectangle.area = "+rectangle.getArea());
        Rectangle rectangle2 = new Rectangle(-1,10);
        System.out.println("rectangle.width = "+ rectangle2.getWidth());
        System.out.println("rectangle.length = "+rectangle2.getLength());
        System.out.println("rectangle.area = "+rectangle2.getArea());
    }

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        if (width < 0) {
            width = 0;
        }
        return width;
    }

    public double getLength() {
        if (length < 0) {
            length = 0;
        }
        return length;
    }

    public double getArea() {
        return length * width;
    }
}

