package Factory;

import Factory.components.Button.Button;

import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String p = sc.nextLine();
        Platform platform =  Platform.createPlatform(p);
        UIComponentFactory uiComponentFactory =  platform.createUIComponentFactory();
        uiComponentFactory.createDropdown();
        Button b =  uiComponentFactory.createButton();
        b.getButtonType();
        b.clickButton();
        uiComponentFactory.createMenu();
    }
}

// mysql :  SQLQuery, TypeATransaction
// pgsql : SQLQuery , TypeBTransaction
// oracleDB : SQLQuery , TypeATransaction
