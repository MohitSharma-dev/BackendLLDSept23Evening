package AdapterV1;

public class YesBankAPI {
    int from;
    int to;
    int amount;

    int getBalance() {
        return 100;
    }

    void moneyTransfer(){
        System.out.println("Money is transferred via Yes Bank");
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
