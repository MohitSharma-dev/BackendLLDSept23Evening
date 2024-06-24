package AdapterV1;

public class PhonePeLoan {
    boolean checkEligibility(BankAPI bankAPI){
        if(bankAPI.checkBalance() > 1000){
            return true;
        }
        return false;
    }
}
