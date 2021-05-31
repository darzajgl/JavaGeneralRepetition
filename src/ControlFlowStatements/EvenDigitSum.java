package ControlFlowStatements;
/* Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1));
        System.out.println(getEvenDigitSum(2));
        System.out.println(getEvenDigitSum(11));
        System.out.println(getEvenDigitSum(22));
        System.out.println(getEvenDigitSum(2112));
        System.out.println(getEvenDigitSum(333333332));
        System.out.println(getEvenDigitSum(-1));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int digit;
        int sum = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
