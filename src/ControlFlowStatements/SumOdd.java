package ControlFlowStatements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/* Write a method called isOdd with an int parameter and callit number. The method needs to return a boolean.
Check that number is>0, if it is not return false.
If number is odd return true, otherwise return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
It should call the method is Odd to check if each number is odd.
The parameter end needs to be greater or equal to start and both start and end parameters have to be greater than 0.
If these conditions are not satisfied return -1 from the method to indicate invalid input.

 */
public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(12,12));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,-100));
    }


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start > 0) && (end > 0) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;

        } else {
            return -1;
        }
    }
}

