package ExpressionsStatementsCodeBlocksMethods;
/* Write a method called printMegaBytesAndKiloBytes that has 1 parameter type of int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from kiloBytes parameter.
Then it needs to print a message in the format"XX KB = YY MB and ZZ KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value"
 */

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(100000);
        printMegaBytesAndKiloBytes(-1);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesReminder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesReminder + " KB");
        }
    }
}
