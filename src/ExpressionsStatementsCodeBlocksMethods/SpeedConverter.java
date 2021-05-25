package ExpressionsStatementsCodeBlocksMethods;

/*1. Write a method called toMilesPerHour that has 1 parameter of type double with name kilometersPerHour. This method needs to return the rounded value of the calculation of type long
If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate the invalid value.
Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
This method should not return anything and it needs to calculate milesPerHOur from the kilometersPerHOur parameter.
Then it needs to print a message in the format "XX km/h = YY mi/h"
If the parameter kilometersPerHour is < 0 then print the text "Invalid value"
 */

public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(25.42);
        printConversion(100);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi'h");
        }
    }
}
