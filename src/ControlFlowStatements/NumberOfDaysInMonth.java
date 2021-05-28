package ControlFlowStatements;

/*Write a method getDaysInMonth with two parameters month and year. Both of type int.
If parameter month is <1 or > 12 return -1.
If parameter year is < 1 or > 999 then return -1.
This method needs to return the number of days in the month. Be careful about leap years they have 29 days in February.
 */
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(1, 2021));
        System.out.println(getDaysInMonth(2, 2021));
        System.out.println(getDaysInMonth(3, 2021));
        System.out.println(getDaysInMonth(4, 2021));
        System.out.println(getDaysInMonth(5, 2021));
        System.out.println(getDaysInMonth(-5, 2021));
        System.out.println(getDaysInMonth(2, 2000));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }


    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                if (isLeapYear(year)) {
                    days++;
                }
                break;
            default:
                days = -1;
        }
        return days;
    }
}