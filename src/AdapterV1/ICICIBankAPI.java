package AdapterV1;

public class ICICIBankAPI {
    int balanceCheck(){
        return 100;
    }

    boolean transfer(int to, int from , int amount){
        System.out.println("Money is transferred using ICICIBank");
        return true;
    }
}
