package Polymorphism;

/*For this exercise you will create four classes of vehicles.
The first class should be named Car.
This will be the base class for three others classes, Mitsubishi, Holden and Ford.

The first class contains four member variables, or fields, with these names and codnitions:
-engine of type boolean
-cylinders of type int
-name of type String
-wheels of type int

All four member variables should have private access.

The constructor should accept two parameters, cylinders and name.
Also, all of these cars have an engine and four wheels. So the other two fields should be set to default values.

In addition, there are five other methods. These methods should be defined as described below:

1. startEngine accepts no parameters and return a message which says that the car's engine is starting.
2. accelerate accept no parameters and returns a message that says the car is accelerating.
3. brake accepts no parameters and returns a message stating the car is braking.
The messages these methods return should somewhere contain the name of class, Car.


Two getter methods should also be defined here for the member variables cylinders and name.
All methods have public access.

The other three classes mentioned above are sub-classes of Car. These classes, have no member variables and the constructor for each will call the parent constructor for object instantiation.
Each of these classes will override the three parent methods startsEngine, accelerate and brake.
The return messages for these methods should somewhere contain the name of the class to which the methods belong.


 */
public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";

    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

}
