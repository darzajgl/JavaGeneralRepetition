package ControlFlowStatements;

/*Write a method named hasSharedDigit with two parameters of type in.
Each number should be with the range of 10 - 99 (inclusive).
If one of two numbers is not within te range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 11 && a <= 99) && (b >= 11 && b <= 99)) {
            int aLastDigit = a % 10;
            int bLastDigit = b % 10;
            int aFirstDigit = a / 10;
            int bFirstDigit = b / 10;
            if ((aFirstDigit == bFirstDigit) || (aFirstDigit == bLastDigit) || (aLastDigit == bFirstDigit) || (aLastDigit == bLastDigit)) {
                return true;
            }
        } return false;
    }
}
