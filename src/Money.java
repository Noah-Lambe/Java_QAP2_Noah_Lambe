public class Money {
    private long dollars = 0;
    private long cents = 0;

    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) ((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        dollars = otherObject.dollars;
        cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long newCents = cents + otherAmount.cents;
        long newDollars = dollars + otherAmount.dollars + (newCents / 100);
        newCents = newCents % 100;
        return new Money(newDollars + (newCents / 100.0));
    }

    public Money subtract(Money otherAmount) {
        long newDollars = dollars - otherAmount.dollars;
        long newCents = cents - otherAmount.cents;

        if (newCents < 0) {
            newCents += 100;
            newDollars--;
        }

        return new Money(newDollars + (newCents / 100.0));
    }

    public int compareTo(Money otherObject) {
        return Long.compare(dollars * 100 + cents, otherObject.dollars * 100 + otherObject.cents);
    }

    public boolean equals(Money otherObject) {
        if (otherObject == null) return false;
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return dollars + "." + String.format("%02d", cents);
    }

}
