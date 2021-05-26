package ExpressionsStatementsCodeBlocksMethods;
/* Teen if is in the range 13-19 (inclusive)
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13-19. Otherwise, return false

Write second method named isTeen with one parameter of type int.
The method should return boolean and it needs to return true of the parameter is in range 13-19. Otherwise, return false;
 */


public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("true?: " + hasTeens(9, 99, 19));
        System.out.println("true?: " + hasTeens(23, 13, -19));
        System.out.println("false?: " + isTeen(22));
        System.out.println("false?: " + isTeen(12));
        System.out.println("false?: " + isTeen(-13));
        System.out.println("true?: " + isTeen(13));

    }

    public static boolean hasTeens(int first, int second, int third) {
        if ((first >= 13 && first <= 19) ||
                (second >= 13 && second <= 19) ||
                (third >= 13 && third <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int first) {
        if (first >= 13 && first <= 19) {
            return true;
        }
        return false;
    }

}

