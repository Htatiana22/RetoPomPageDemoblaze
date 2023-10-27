package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private final By txtUser = By.id("loginusername");
    private final By txtPassword = By.id("loginpassword");
    private final By btnLogIn = By.xpath("//button[.='Log in']");
    public By getTxtUser() {
        return txtUser;
    }
    public By getTxtPassword() {
        return txtPassword;
    }
    public By getBtnLogIn() {
        return btnLogIn;
    }
}
