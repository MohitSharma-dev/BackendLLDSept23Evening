package AdapterV1;

public class FastTagRecharge {
    int recharge(BankAPI bankAPI , int amount){
        if(bankAPI.checkBalance() > amount){
            System.out.println("Recharge is successfully done");
            return 1;
        }
        return -1;
    }
}
