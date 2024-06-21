package Factory;

public class Windows extends Platform{
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new WindowsUIComponentFactory();
    }
}
