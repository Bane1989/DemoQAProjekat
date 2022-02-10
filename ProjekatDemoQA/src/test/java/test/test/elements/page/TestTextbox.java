package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTextbox extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        elementsPage.clickOnElement(0);
    }

    @Test(priority = 10)
    public void verifyThatEachFieldIsAcceptedUsingAValidEntry() {
        String fullName = excelReader.getStringData("Textbox", 1, 0);
        String validEmail = excelReader.getStringData("Textbox", 1, 1);
        String currentAddress = excelReader.getStringData("Textbox", 1, 2);
        String permanentAddress = excelReader.getStringData("Textbox", 1, 3);

        textbox.inputFullName(fullName);
        textbox.inputEmail(validEmail);
        textbox.inputCurrentAddress(currentAddress);
        textbox.inputPermanentAddress(permanentAddress);
        scroll(textbox.getSubmitButton());
        textbox.clickOnSubmitButton();

        Assert.assertEquals(fullName, textbox.outputTextOfInput(0));
        Assert.assertEquals(validEmail, textbox.outputTextOfInput(1));
        Assert.assertEquals(currentAddress, textbox.outputTextOfInput(2));
        Assert.assertEquals(permanentAddress, textbox.outputTextOfInput(3));

    }

    @Test(priority = 20)
    public void verifyThatEmailInputIsNotAcceptedUsingInvalidEmai() throws InterruptedException {
        String invalidEmail = excelReader.getStringData("Textbox", 1, 4);

        textbox.inputEmail(invalidEmail);
        scroll(textbox.getSubmitButton());
        textbox.clickOnSubmitButton();


        Assert.assertTrue(textbox.getListOfMessages().isEmpty());
        scroll(textbox.getEmail());
        System.out.println(textbox.getEmail().getCssValue("border"));
        Assert.assertTrue(textbox.getEmail().getCssValue("border").equalsIgnoreCase("1px solid rgb(255, 0, 0)"));

    }

}
