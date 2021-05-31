package ControlFlowStatements;
/* Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within range of 10 - 1000 inclusive.
If the one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10-1000, otherwise return false.
 */

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(99,9,999));
        System.out.println(hasSameLastDigit(-99,9,999));

        System.out.println("*****");

        System.out.println(isValid(10));
        System.out.println(isValid(0));
        System.out.println(isValid(-1));
        System.out.println(isValid(1001));
        System.out.println(isValid(1000));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a >= 11 && a <= 1000) && (b >= 11 && b <= 1000) && (c >= 10 && c <= 1000)) {
            int aLastDigit = a % 10;
            int bLastDigit = b % 10;
            int cLastDigit = c % 10;
            if (aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int a) {
        if (a >= 10 && a <= 1000) {
            return true;
        }
        return false;
    }

}
