public class CreditCard {
    private Money balance = new Money(0);
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = limit;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) > 0) {
            System.out.println("Charge exceeds credit limit");
        }
        balance = balance.add(amount);
    }

    public void payment(Money amount) {
        if (amount.compareTo(balance) > 0) {
            System.out.println("Payment exceeds balance");
        }
        balance = balance.subtract(amount);
    }


}
