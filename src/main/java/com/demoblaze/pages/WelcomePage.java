package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WelcomePage extends PageObject {
    private final By lnkWelcome = By.id("nameofuser");
    public By getLnkWelcome() {
        return lnkWelcome;
    }
}
