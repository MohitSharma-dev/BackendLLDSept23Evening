package Strategy;

import java.nio.file.Path;

public class PathCalculatorStrategyFactory {
    static PathCalculatorStrategy getPathCalculatorStrategyByMode(TravelMode travelMode) {
        PathCalculatorStrategy pathCalculatorStrategy = null;
        if(travelMode.equals(TravelMode.BIKE)){
            pathCalculatorStrategy = new BikePathCalcStrategy();

        } else if (travelMode.equals(TravelMode.CAR)){
            pathCalculatorStrategy = new CarPathCalcStrategy();

        } else if (travelMode.equals(TravelMode.WALK)){
            pathCalculatorStrategy = new WalkPathCalcStrategy();
        }
        return  pathCalculatorStrategy;
    }
}
