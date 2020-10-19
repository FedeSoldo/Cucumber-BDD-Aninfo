package icecreamshop;

public class IceCreamShop {

    private int amount;
    private int debtAmount;

    public IceCreamShop(int initialDayAmount) {
        amount = initialDayAmount;
        debtAmount = 0;
    }

    public void buy(int clientAmount) {
        amount += clientAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void pay(int payAmount) throws Exception {
        if ( payAmount >= amount ) {
            debtAmount = payAmount;
            throw new Exception("Insufficient founds");
        }
        amount -= payAmount;
    }

    public int getDebtAmount() {
        return debtAmount;
    }
}
