package Factory;

import Factory.components.Button.Button;

public abstract class Platform {
    String platform;
    void setRefreshRate(){

    }

    void setTheme(){

    }

//    void createButton(){
//        if(platform.equals("Windows")){
//            // create a windows button
//        } else if (platform.equals("Linux")){
//            // create a linux button
//        } else if (platform.equals("IOS")){
//            // create an IOS button
//        } else if (platform.equals("Android")){
//            // create a new Button
//        }
//    }
//    abstract Button createButton();
    abstract UIComponentFactory createUIComponentFactory();

    static Platform createPlatform(String platformName){
        return PlatformFactory.getPlatformByName(platformName);
    }
}
