package com.demoblaze.steps;

import com.demoblaze.pages.WelcomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidateLogin {
    @Page
    WelcomePage welcomePage;
    @Step("Validate welcome message")
    public void validateMessage(){

        WebDriverWait wait = new WebDriverWait(welcomePage.getDriver(), Duration.ofSeconds(15));
        WebElement lnk = wait.until(
                ExpectedConditions.visibilityOfElementLocated(welcomePage.getLnkWelcome())
        );
        Assert.assertTrue(
                lnk.isDisplayed()
        );
    }
}
