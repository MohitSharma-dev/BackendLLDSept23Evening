package PhonePe;

public class PhonePe {
    BankAPI b = new ICICIBankAPI();

    void printBalance(){
        System.out.println(b.getBalance());
    }

    void depositMoney(int amt){
        b.deposit(amt);
    }
}
