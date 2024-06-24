package AdapterV0;

public class PhonePeLoan {
    boolean checkEligibility(YesBankAPI yb){
        if(yb.getBalance() > 1000){
            return true;
        }
        return false;
    }
}
