package PhonePe;

public class ICICIBankAPI implements BankAPI, BankAPIPlus{
    @Override
    public int getBalance() {
        int x = getKey();
        System.out.println(x);
        return 100;
    }

    public int getKey(){
        return -1;
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Money deposited");
    }
}
