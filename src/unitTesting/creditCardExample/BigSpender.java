package unitTesting.creditCardExample;

import java.text.NumberFormat;

/**
 * BigSpender.
 *
 * @author BCIT
 * @version 2020
 */
public class BigSpender {

    /**
     * Constructor for objects of type BigSpender.
     */
    public BigSpender() {
    }

    /**
     * Drives the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("I like to spend money.  I am getting a new Visa with a limit of $3000.");
        CreditCard myNewVisa = new CreditCard("Leszek", 3000);
        System.out.println("My credit limit is: " +
                NumberFormat.getCurrencyInstance().format(myNewVisa.getCreditLimit()));
        System.out.println("I am spending $500 on a new bicycle.");
        myNewVisa.addCharge(500.00);
        System.out.println("My new balance is: " +
                NumberFormat.getCurrencyInstance().format(myNewVisa.getBalance()));
        System.out.println("I am spending $2000 on a new gaming laptop.");
        myNewVisa.addCharge(2000);
        System.out.println("My new balance is: " +
                NumberFormat.getCurrencyInstance().format(myNewVisa.getBalance()));
        System.out.println("I am drunk.  I am trying to buy a $1000 gadget online.");
        myNewVisa.addCharge(1000);
        System.out.println("My new balance is: " +
                NumberFormat.getCurrencyInstance().format(myNewVisa.getBalance()));
    }

}
