package com.demoblaze.steps;

import com.demoblaze.pages.LoginPage;
import com.demoblaze.utils.EnterData;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps  {
    @Page
    LoginPage loginPage;
    @Step("Enter credentials to log in")
    public void enterData(){

        loginPage.getDriver().findElement(loginPage.getTxtUser())
                .sendKeys(EnterData.extractTo().get(0).get("User"));

        loginPage.getDriver().findElement(loginPage.getTxtPassword())
                .sendKeys(EnterData.extractTo().get(0).get("Password"));

        loginPage.getDriver().findElement(loginPage.getBtnLogIn()).click();
    }

}
