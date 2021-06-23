package BillsBurgers;
/* The purpose of this application is to help a company called Bill's Burgers manage the process of selling their hamburgers.
And in order to match Bill's menu, you will need to create three classes, Hamburger, DeluxeBurger and HealthyBurger.
For the base Hamburger class, there will need to be four variables to represent the four basic ingredients of the hamburger, name, meat, price and breadRollType.
The price variable should be of type double, while the other three are of type String.
A constructor will be needed to accept these four values as parameters when creating a new hamburger.

There will also need to be a separate variables for four possible additions to the hamburger. Those should be declared with these names:
addition1Name, addition1Price, addition2Name, addition3Name, addition3Price ,addition4Name, addition4Price.
The name variables should be of type String and the price variables should be of type double.

Five methods are also needed inside the Hamburger class.
Four for adding up to four additions to the hamburger and one for printing out an itemized listing of the final hamburger with addons, if any, and the total price.
Remember that a name and price mus be accepted as parameters in the firs four methods so that the price of the hamburger is adjusted accordingly.
These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4 and itemizeHamburger.
The firs four methods do not return values, but the las method does return the total price of the hamburger of type double, which includes the base price of the hamburger plus any additional items.

For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters.
Instead, the constructor creates a deluxe burger with all the fixings and chins and a drink for a base price of $19.01.
The constructor can be configured in any wat, as long as chips and drink are added for the total price just mentioned.
In this class for including additional toppings must each be overridden so that a message is printed stating that no additional items can be added to a deluxe burger.

And for the third class, HealthyBurger, there will be four additional member variables called
healthyExtra1Name, healthyExtra1Price, healthyExtra2Name and healthyExtra2Price.
The names are type String and the prices are type double. The constructor for this class accepts two parameters for meat and price.
Those are set in the constructor along with an appropriate name of the type of burger.

Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a nape and price for the addition, allowing for up to two addons to the basic healthy burger.
And finally the itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to the type of burger along with any addons.
The method also returns the total price of the healthy burger of type double.
        */

public class BurgersMain {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Sausage",3.50,"White");
        hamburger.addHamburgerAddition1("Tomato", 0.23);
        hamburger.addHamburgerAddition2("Lettuce",0.39);
        hamburger.addHamburgerAddition3("Cheese", 1.20);
        System.out.println("Total Burger price is "+hamburger.itemizeHamburger());

        System.out.println();
        System.out.println("**************");
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.70);
        healthyBurger.addHamburgerAddition1("Egg", 5.11);
        healthyBurger.addHealthyAddition1("Lentils", 1.49);
        System.out.println("Total Healthy Burger price is "+healthyBurger.itemizeHamburger());

        System.out.println();
        System.out.println("**************");
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition2("Should not do this", 50.51);
        System.out.println("Total Deluxe Burger price is " +deluxeBurger.itemizeHamburger());
    }


}
