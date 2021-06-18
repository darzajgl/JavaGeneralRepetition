package Composition;

public class MainComposition {
    public static void main(String[] args) {
        //creating walls
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        //creating ceiling
        Ceiling ceiling = new Ceiling(11,55);
        //creating bed
        Bed bed = new Bed("Modern",1,5,4,2);
        //creating lamp
        Lamp lamp = new Lamp("Classic",false,75);

        //creating bedroom by passing all these objects as parameters
        Bedroom bedroom = new Bedroom("John",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        //testing methods in Bedroom Class
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
