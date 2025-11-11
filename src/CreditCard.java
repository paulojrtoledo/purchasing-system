import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> purchasesList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchasesList = new ArrayList<>();
    }

    public boolean launchPurchase(Purchase purchase) {
        if (this.balance > purchase.getValue()) {
            this.balance -= purchase.getValue();
            this.purchasesList.add(purchase);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchases() {
        return purchasesList;
    }
}
