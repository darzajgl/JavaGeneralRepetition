package ControlFlowStatements;
/* Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
Ifo one of the parameters is < 10 the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int)
Greatest common divisor is the largest positive integer that can fully divide each of the integers.
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9,18));;
        System.out.println(getGreatestCommonDivisor(19,11));;
        System.out.println(getGreatestCommonDivisor(81,153));;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return first;
    }
}