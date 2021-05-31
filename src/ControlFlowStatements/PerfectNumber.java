package ControlFlowStatements;
/* What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a reminder and exclude the perfect number itself.

Write a method named isPerfectNumber with one parameter of type in named number.
IF number is <1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, the method should return true, otherwise, it should return false.
 */

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("false?: "+isPerfectNumber(0));
        System.out.println("true: "+isPerfectNumber(1));
        System.out.println("true?: "+isPerfectNumber(6));
        System.out.println("false?: "+isPerfectNumber(7));
        System.out.println("false?: "+isPerfectNumber(12));
        System.out.println("true?: "+isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}