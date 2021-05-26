package ExpressionsStatementsCodeBlocksMethods;
/* Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 */

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstNum = (int) (firstNumber * 1000);
        int secondNum = (int) (secondNumber * 1000);
        if (firstNum == secondNum) {
            return true;
        }
        return false;
    }
}

