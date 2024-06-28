package Strategy;

public class WalkPathCalcStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("Walk Path is being calculated");
    }
}
