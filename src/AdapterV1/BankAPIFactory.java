package AdapterV1;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankAPIName) {
        if(bankAPIName.equals("YesBank")) {
            return new YesBankAPIAdapter();
        } else if (bankAPIName.equals("ICICIBank")){
            return new ICICIBankAPIAdapter();
        }
        throw new IllegalArgumentException("No such Bank found!");
    }
}
