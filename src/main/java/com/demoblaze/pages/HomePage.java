package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private final By lnkLogin = By.id("login2");
    public By getLnkLogin() {
        return lnkLogin;
    }
}
