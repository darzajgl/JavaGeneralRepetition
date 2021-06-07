package ControlFlowStatements;

import java.util.Scanner;

/* Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything and it needs to keep reading int numbers from the keyboard.
When the user enters something that is noa an int then it needs to print a message in the format
 "SUM = XX AVG = YY'
  */
public class InputCalculator {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int counter = 1;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        avg = Math.round(sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
