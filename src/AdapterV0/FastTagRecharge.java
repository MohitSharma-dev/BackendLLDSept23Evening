package AdapterV0;

public class FastTagRecharge {
    int recharge(YesBankAPI yb ,  int amount){
        if(yb.getBalance() > amount){
            System.out.println("Recharge is successfully done");
            return 1;
        }
        return -1;
    }
}
