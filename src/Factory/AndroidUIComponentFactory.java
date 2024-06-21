package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.Dropdown.AndroidDropdown;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.AndroidMenu;
import Factory.components.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
