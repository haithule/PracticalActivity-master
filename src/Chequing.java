import java.util.ArrayList;

/**
 * Created by alenasynkova on 2017-11-25.
 */
public class Chequing implements Account {
    double purchase;
    double withdrawn;
    double deposit;
    double transferToCard;


    public Chequing(int accID, double balance, ArrayList<CreditCard> cards) {

    }

    @Override
    public double getBalanca() {
        return 0;   //change that
    }

    public double getPurchase() {
        return purchase;
    }

    public double getWithdrawn() {
        return withdrawn;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getTransferToCard() {
        return transferToCard;
    }

    public int getAccountID() {
        return 0;  //change that
    }

    @Override
    public void purchase(double amount) {

    }

    @Override
    public void setBalance(double amount) {

    }
}


