package AdapterV1;

import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String bankAPIName = sc.nextLine();
        BankAPI b = BankAPIFactory.getBankAPIByName(bankAPIName);
        PhonePe p = new PhonePe();
        p.setBankAPI(b);

        p.doFastTagRecharge(20);
    }
}
