package Factory;

import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menu;

public class WindowsUIComponentFactory implements UIComponentFactory {
    @Override
    public Dropdown createDropdown() {
        return null;
    }

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
