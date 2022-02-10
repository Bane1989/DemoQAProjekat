package test.test.elements.page;

import base.BasePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDynamicProperties extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        scroll(elementsPage.getListOfElements().get(8));
        elementsPage.clickOnElement(8);
    }

    @Test(priority = 10)
    public void verifyThatAllButtonsPerformGivenFunction() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(dynamicProperties.isEnableAfterButton());

        Assert.assertFalse(Boolean.parseBoolean(Color.fromString(dynamicProperties.getColorChange().getCssValue("color")).asHex()));

        Assert.assertTrue(dynamicProperties.isVisibleAfterButton());
    }

}
