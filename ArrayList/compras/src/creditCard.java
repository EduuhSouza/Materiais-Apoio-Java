import java.util.ArrayList;
import java.util.List;

public class creditCard {
    private double limit;
    private double balance;
    private List<Buy> shopping;

    public creditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shopping = new ArrayList<>();
    }

    // VERIFICA O VALOR E SUBTRAI, se for verdadeiro ele subtrai se não ele retorna false
    public boolean launchPurchase(Buy buy){
        if (this.balance > buy.getValue()){
            this.balance -= buy.getValue();
            this.shopping.add(buy);
            return true;
        }
        return false;
    }


    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Buy> getShopping() {
        return shopping;
    }
}
