package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRadioButton extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        elementsPage.clickOnElement(2);
    }

    @Test(priority = 10)
    public void verifyThatUserCanSelectYesRadioButton() {
        radioButton.clickOnRadioButton(0);
        String textOfButton = radioButton.getTextOfRadioButton(0);
        System.out.println(textOfButton);
        String successText = radioButton.getSucessMessage().getText();
        System.out.println(successText);
        Assert.assertEquals(textOfButton, successText);
    }

    @Test(priority = 20)
    public void verifyThatUserCanSelectImpressiveRadioButton() {
        radioButton.clickOnRadioButton(1);
        String textOfButton = radioButton.getTextOfRadioButton(1);
        System.out.println(textOfButton);
        String successText = radioButton.getSucessMessage().getText();
        System.out.println(successText);
        Assert.assertEquals(textOfButton, successText);
    }

    @Test(priority = 30)
    public void verifyThatUserCanSelectNoRadioButton() {
        radioButton.clickOnRadioButton(2);
        String textOfButton = radioButton.getTextOfRadioButton(2);
        System.out.println(textOfButton);
        String successText = radioButton.getSucessMessage().getText();
        System.out.println(successText);
        Assert.assertEquals(textOfButton, successText);
    }
}
