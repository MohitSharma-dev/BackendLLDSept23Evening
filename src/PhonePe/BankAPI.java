package PhonePe;

public interface BankAPI {
    int getBalance();
    void deposit(int amount);

    default int getKey(){
        return -1;
    }
}
