package ControlFlowStatements;
/* Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.

 */

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-111));
        System.out.println(isPalindrome(112));
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(-12321));
    }

    public static boolean isPalindrome(int number) {
        int orgNumber = number;
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum *= 10;
            sum += lastDigit;
            number /= 10;
        }
        return orgNumber == sum;
    }
}
