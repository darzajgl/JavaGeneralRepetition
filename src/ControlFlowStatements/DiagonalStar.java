package ControlFlowStatements;
/* Write a method named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars(*).
This should be accomplished by using loops.
 */

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(1);
        printSquareStar(2);
        printSquareStar(3);
        printSquareStar(4);
        System.out.println("***");
        printSquareStar(5);
        System.out.println("oooooooooo");
        printSquareStar(6);
        System.out.println("oooooooooo");
        printSquareStar(7);
        System.out.println("oooooooooo");
        printSquareStar(8);
        System.out.println("oooooooooo");
        printSquareStar(9);
        System.out.println("oooooooooo");
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++)
                if (((i == 1) || (i == number)) ||
                        ((j == 1) || (j == number)) ||
                        (i == j) || (j == (number - i + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}