package Factory;

public class PlatformFactory {
    static Platform getPlatformByName(String platformName){
        if(platformName.equals("Android")){
            return new Android();
        } else if (platformName.equals("IOS")){
            return new IOS();
        }
        return null;
    }
}
