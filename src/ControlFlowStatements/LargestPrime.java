package ControlFlowStatements;

/* Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
 */
public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(1));
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(5));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int prime = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                prime = i;
                number /= i;
                i--;
            }
        }
        return prime;
    }
}
