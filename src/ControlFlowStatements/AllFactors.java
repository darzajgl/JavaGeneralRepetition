package ControlFlowStatements;
/* Write a method named printFactors with one parameter of type int named number.
If number is <1, the method should print "Invalid Value".
The method should print all factors of the number. A factor of a number is an integer which divides that number wholly.
 */

public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
        printFactors(0);
        printFactors(1);
        printFactors(2);

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}