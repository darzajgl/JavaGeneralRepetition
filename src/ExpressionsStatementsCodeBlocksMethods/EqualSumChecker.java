package ExpressionsStatementsCodeBlocksMethods;
/* Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
 */

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("false?: " + hasEqualSum(1, 1, 1));
        System.out.println("true?: " + hasEqualSum(1, 1, 2));
        System.out.println("true?: " + hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        if (first + second == third) {
            return true;
        }
        return false;
    }
}
