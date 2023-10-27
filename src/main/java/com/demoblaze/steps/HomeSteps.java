package com.demoblaze.steps;

import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeSteps {
    @Page
    HomePage homePage;
    @Step("open browser")
    public void openBrowser(){
        homePage.openUrl("https://www.demoblaze.com/index.html");
    }
    public void clickLogIn(){
        homePage.getDriver().findElement(homePage.getLnkLogin()).click();
    }
}
