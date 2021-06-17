package ClassesConstructorsInheritance;
/* Write a class with the name Cuboid that extends Rectangle class.
The class needs one field with name height of type double.
The class needs to have one constructor with three parameters width, length and height all of type double. It needs to call parent constructor and initialize a height field.
In case the height is less than 0 it needs to set the height field value to 0.

Write the following methods:
1.getHeight
2. getVolume without any parameters, it needs to return the calculated volume.
 */

public class Cuboid extends Rectangle {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5, 10, 6);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.volume = " + cuboid.getVolume());
        Cuboid cuboid2 = new Cuboid(10, 10, -1);
        System.out.println("cuboid2.width = " + cuboid2.getWidth());
        System.out.println("cuboid2.length = " + cuboid2.getLength());
        System.out.println("cuboid2.height = " + cuboid2.getHeight());
        System.out.println("cuboid2.area = " + cuboid2.getArea());
        System.out.println("cuboid2.volume = " + cuboid2.getVolume());
    }


    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        if (height < 0) {
            height = 0;
        }
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}