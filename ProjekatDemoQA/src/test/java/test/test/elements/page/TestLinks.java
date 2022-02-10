package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestLinks extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        scroll(elementsPage.getListOfElements().get(5));
        elementsPage.clickOnElement(5);
    }

    @Test(priority = 10)
    public void verufyThatClickOnHomeLinkRedirectedUserToHomePageInNewTab() throws InterruptedException {
        links.clickOnHomelink();

        String expectedURL = "https://demoqa.com/";

        ArrayList<String> listOfTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfTabs.get(1));
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);
    }

    @Test(priority = 20)
    public void verifyThatClickOnCreatedLinkShowsWrightMessage() {
        links.clickOnCreatedLink();

        String expectedMessage = "Link has responded with staus 201 and status text Created";
        String actulaMessage = links.responseMessage();

        Assert.assertEquals(expectedMessage, actulaMessage);
    }

}
