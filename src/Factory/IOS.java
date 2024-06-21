package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;

public class IOS extends Platform{
//    @Override
//    Button createButton() {
//        return new IOSButton();
//    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
