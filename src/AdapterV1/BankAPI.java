package AdapterV1;

public interface BankAPI {
    int checkBalance();
    boolean transferMoney(int from, int to, int amount);
}
