package AdapterV1;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public boolean transferMoney(int from, int to, int amount) {
        yesBankAPI.setFrom(from);
        yesBankAPI.setTo(to);
        yesBankAPI.setAmount(amount);
        yesBankAPI.moneyTransfer();
        return true;
    }
}
