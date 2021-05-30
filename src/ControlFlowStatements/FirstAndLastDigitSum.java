package ControlFlowStatements;

/* Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit ot the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(11));
        System.out.println(sumFirstAndLastDigit(12));
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(-11));
        System.out.println(sumFirstAndLastDigit(-10000001));
        System.out.println(sumFirstAndLastDigit(10000001));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            while (number > 9) {
                number /= 10;
            }
            int x = lastDigit + number;
            return x;
        }
    }
}