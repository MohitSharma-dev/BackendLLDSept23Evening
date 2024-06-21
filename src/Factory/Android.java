package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;

public class Android extends Platform{
//    @Override
//    Button createButton() {
//        return new AndroidButton();
//    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
