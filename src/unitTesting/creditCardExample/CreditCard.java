package unitTesting.creditCardExample;

/**
 * Represents a credit card having a specified credit limit.
 * 
 * @invariant getBalance() <= getCreditLimit()
 * @invariant each new account has a new unique number
 * @author BCIT
 * @version 2020
 */
public class CreditCard {
    private static final int FIRST_NUM = 1000;
    private static int nextNum = FIRST_NUM;
    private String name;
    private int number;
    private double creditLimit;
    private double balance;

    /**
     * Constructor creates a credit card with the given name and credit limit
     * and a new number that is the next in the series.
     * 
     * @post getBalance() = 0
     * @post IF creditLimit >= 0 THEN getCreditLimit() = creditLimit else
     *       getCreditLimit() = 0
     * @post getNumber() is a new number, unique for this card
     * @param name
     *            The name of the card holder.
     * @param creditLimit
     *            The credit limit.
     */
    public CreditCard(String name, double creditLimit) {
        this.name = name;
        if (creditLimit >= 0) {
            this.creditLimit = creditLimit;
        } else {
            creditLimit = 0;
        }
        number = nextNum++;
        balance = 0.0;
    }

    /**
     * Retrieves the credit limit.
     * 
     * @return The credit limit.
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Retrieves the balance on the account.
     * 
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves name of card holder.
     * 
     * @return Name of card holder.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the credit card number.
     * 
     * @return Credit card number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Adds a payment to the account.
     * 
     * @param amount
     *            The amount to be paid.
     * @post IF amount >= 0 THEN getBalance() = @pre.getBalance() - amount ELSE
     *       getBalance() = @pre.getBalance()
     */
    public void addPayment(double amount) {
        
            balance -= amount;
        
    }

    /**
     * Adds a charge to the account.
     * 
     * @param chargeAmount
     *            The amount to be charged.
     * @post IF chargeAmount >= 0 AND @pre.getBalance() + chargeAmount <=
     *       getCreditLimit() THEN getBalance() = @pre.getBalance() +
     *       chargeAmount ELSE getBalance() = @pre.getBalance()
     */
    public void addCharge(double chargeAmount) {
            balance -= chargeAmount;

    }
}
