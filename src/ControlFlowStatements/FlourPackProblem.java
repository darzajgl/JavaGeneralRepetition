package ControlFlowStatements;

/* Write a method named canPack with three parameters of type int named bigCount, smallCount and goal.
The parameter bigCount represents the count of big flour bags (5kg).
The parameter small Count represents the count of small flour bags (1kg).
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of bigCount and smallCount must be at least equal to the value of goal.
The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater, than goal, ensure that only full bags are used towards the goal amount.
If any of the parameters are negative, return false.
 */
public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println("false: "+canPack(1,0,4));
        System.out.println("true: "+canPack(1,0,5));
        System.out.println("true: "+canPack(2,2,11));
        System.out.println("false: "+canPack(-12,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int kilos = bigCount * 5 + smallCount;
        int remainingBags = goal % 5;
        if (kilos > goal) {
            return smallCount >= remainingBags;
        }
        return kilos == goal;
    }
}