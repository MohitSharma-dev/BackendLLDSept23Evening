package PhonePe;

import java.util.Comparator;

public class YesBankAPI implements BankAPI{
    @Override
    public int getBalance() {
        return 100;
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Money deposited");
    }
}
