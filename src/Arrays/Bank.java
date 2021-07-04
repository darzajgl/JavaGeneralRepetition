package Arrays;
/*

Implement the following classes:

1.  Bank
-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
-  And five methods, they are (their functions are in their names):
    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the branch was added successfully or false otherwise.
    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
    -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise.
    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it exists or null otherwise.
    -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise. This method prints out a list of customers.

→ TEST CODE

Bank bank = new Bank("National Australia Bank");
bank.addBranch("Adelaide");

bank.addCustomer("Adelaide", "Tim", 50.05);
bank.addCustomer("Adelaide", "Mike", 175.34);
bank.addCustomer("Adelaide", "Percy", 220.12);

bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

bank.listCustomers("Adelaide", true);


2.  Branch
    -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
    -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
    -  And five methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getCustomers(), getter for customers.
        -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. Returns true if the customer was added successfully or false otherwise.
        -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.
        -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the Customer if they exist, null otherwise.

3.  Customer
    -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
    -  A constructor that takes a  String (name of customer) and a double (initial transaction). It initialises name and instantiates transactions.
    -  And three methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getTransactions(), getter for transactions.
        -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.

 */

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(nameOfBranch)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String nameOfBranch) {
        Branch tempBranch = findBranch(nameOfBranch);
        if (tempBranch == null) {
            tempBranch = new Branch(nameOfBranch);
            this.branches.add(tempBranch);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch tempBranch = findBranch(nameOfBranch);
        if (tempBranch != null) {
            return tempBranch.newCustomer(nameOfCustomer, transaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch tempBranch = findBranch(nameOfBranch);
        if (tempBranch != null) {
            return tempBranch.addCustomerTransaction(nameOfCustomer, transaction);
        } else {
            return false;
        }
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch tempBranch = findBranch(nameOfBranch);
        if (tempBranch != null && printTransactions) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for (int i = 0; i < tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                System.out.println("Transactions");
                for (int j = 0; j < tempBranch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j + 1) + "]  Amount " + tempBranch.getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        } else if (tempBranch != null) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for (int i = 0; i < tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            }
            return true;
        } else {
            return false;
        }
    }


}
