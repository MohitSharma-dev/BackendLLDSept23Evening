package Strategy;

public class GoogleMaps {

    void findPath(String source , String dest , TravelMode travelMode){
        if(travelMode.equals(TravelMode.BIKE)){
            System.out.println("Bike path is being calculated");
        } else if (travelMode.equals(TravelMode.CAR)){
            System.out.println("Car path is being calculated");
        } else if (travelMode.equals(TravelMode.WALK)){
            System.out.println("Walk path is being calculated");
        }
    }
}
