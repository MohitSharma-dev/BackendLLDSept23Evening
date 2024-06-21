package Factory.components.Button;

public class IOSButton implements Button {
    @Override
    public void getButtonType() {
        System.out.println("I am IOS Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Button is clicked!");
    }
}
