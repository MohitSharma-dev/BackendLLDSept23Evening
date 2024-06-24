package AdapterV1;

public class PhonePe {
    BankAPI bankAPI;
    FastTagRecharge ftr = new FastTagRecharge();
    PhonePeLoan pl = new PhonePeLoan();

    public void setBankAPI(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    boolean doFastTagRecharge(int amount){
        return ftr.recharge(bankAPI, 50) > 0;
    }

    boolean availLoan(){
        if(!pl.checkEligibility(bankAPI)){
            System.out.println("You are not eligible");
            return false;
        } else {
            System.out.println("Loan is granted");
        }
        return true;
    }
}
