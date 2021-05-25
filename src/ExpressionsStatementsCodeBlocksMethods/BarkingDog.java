package ExpressionsStatementsCodeBlocksMethods;
/* Let's have a dog that likes to bark. We need to wake up if the dog is barking at night.
Writhe a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if dog is currently barking.
2nd parameter represents the hour of the day and is of type in with the name hourOfDay and has valid range 0-23.
We have to wake up if the dog is barking before 8 or after 22 so in that case return true.
In all other cases return false.
 */

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("true: " + shouldWakeUp(true, 1));
        System.out.println("false: " + shouldWakeUp(true, 8));
        System.out.println("false: " + shouldWakeUp(true, 24));
        System.out.println("false: " + shouldWakeUp(false, 8));
        System.out.println("false: " + shouldWakeUp(false, 6));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((barking == true) && (((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)))) {
            return true;
        }
        return false;
    }

}
