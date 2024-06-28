package Strategy;

public class GoogleMaps {

    void findPath(String source , String dest , TravelMode travelMode){
        PathCalculatorStrategyFactory
                .getPathCalculatorStrategyByMode(travelMode)
                .findPath(source, dest);
    }
}
