package ClassesConstructorsInheritance;
/* Write a class with the name Cylinder that extends Circle class.
The class needs one file with name height of type double.
The class needs to have one constructor with two parameters radius and height both of type double. It needs to call a parent constructor and initialize height field.
In case the height is less than 0, it needs to set the height field value to 0.
Write the following methods:
1. getHeight without any parameters, it needs to return the value of height field.
2. getVolume without any parameters, it needs to return the calculated volume.
 */


public class Cylinder extends Circle {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());
    }


    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            height = 0;
        }
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}