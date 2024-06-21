package Factory.components.Button;

public class AndroidButton implements Button {
    @Override
    public void getButtonType() {
        System.out.println("I am an Android Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Button is clicked!");
    }
}
