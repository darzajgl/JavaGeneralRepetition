package Arrays;

import java.util.Arrays;

import static Arrays.ReverseArray.reverse;

public class ArraysMain {
    public static void main(String[] args) {
        int[] newArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("The initial array is: " + Arrays.toString(newArray));
        reverse(newArray);
        System.out.println("The reversed array is: " + Arrays.toString(newArray));

        System.out.println("***********************");

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}

