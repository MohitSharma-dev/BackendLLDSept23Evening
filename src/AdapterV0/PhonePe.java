package AdapterV0;

public class PhonePe {
    YesBankAPI yb = new YesBankAPI();
    FastTagRecharge ftr = new FastTagRecharge();
    PhonePeLoan pl = new PhonePeLoan();

    boolean doFastTagRecharge(int amount){
        return ftr.recharge(yb, 50) > 0;
    }

    boolean availLoan(){
        if(!pl.checkEligibility(yb)){
            System.out.println("You are not eligible");
            return false;
        } else {
            System.out.println("Loan is granted");
        }
        return true;
    }
}
