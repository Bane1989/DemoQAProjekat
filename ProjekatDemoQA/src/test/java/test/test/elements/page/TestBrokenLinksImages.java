package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestBrokenLinksImages extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        scroll(elementsPage.getListOfElements().get(6));
        elementsPage.clickOnElement(6);
    }

    @Test(priority = 10)
    public void verifyThatBrokenLinkRedirectedUserToStatusCodesPage() {
        scroll(brokenLinksImages.getListOfLinks().get(1));
        brokenLinksImages.clickOnInvalidLink();

        String expectedURL = "http://the-internet.herokuapp.com/status_codes/500";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);
    }



}
