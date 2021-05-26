package ExpressionsStatementsCodeBlocksMethods;
/*write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value"
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d"
 */

public class MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561600);
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440L;
            long years = days / 365L;
            long daysReminder = days % 365L;
            System.out.println(minutes + " min = " + years + " y and " + daysReminder + " d");
        }
    }
}