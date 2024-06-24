package AdapterV1;


public class ICICIBankAPIAdapter implements BankAPI{
    ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return icicibankAPI.balanceCheck();
    }

    @Override
    public boolean transferMoney(int from, int to, int amount) {
        return icicibankAPI.transfer(to , from , amount);
    }
}
