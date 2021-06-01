package ControlFlowStatements;
/* Wrote a method called numberToWords with one it parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".

 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(12));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-123));
        System.out.println(("*******"));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(12124));
        System.out.println(reverse(1000));
        System.out.println(("*******"));
        numberToWords(123);
        System.out.println(("_"));
        numberToWords(1810);
        System.out.println(("_"));
        numberToWords(-100);
        System.out.println(("_"));
        numberToWords(100);

    }

    public static void numberToWords(int number) {
        int temp = number;
        number = reverse(number);
        int zeroes = getDigitCount(temp) - getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        while (number != 0) {
            int lastDigit = number % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10;
        }
        while (zeroes > 0) {
            System.out.println("Zero");
            zeroes--;
        }
    }

    private static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    private static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number / 10 != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}