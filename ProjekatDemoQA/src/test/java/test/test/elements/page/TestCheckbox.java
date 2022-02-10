package test.test.elements.page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckbox extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        elementsPage.clickOnElement(1);
    }

    @Test(priority = 10)
    public void verifyThatExpandAllButtonWorks() {
        checkbox.clickOnExpandAllButton();

        for (WebElement w : textbox.getListOfElements()) {
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @Test(priority = 20)
    public void verifyThatCollapseAllButtonWorks() {
        checkbox.clickOnExpandAllButton();
        checkbox.clickOnCollapseAllButton();

        Assert.assertTrue(checkbox.getListOfCollExpButtons().size() == 1);

    }

    @Test(priority = 30)
    public void verifyThatAllCheckboxButtonsCanBeSelected() {
        for (int i = 0; i < checkbox.getListOfCollExpButtons().size(); i++) {
            scroll(checkbox.getListOfCollExpButtons().get(i));
            checkbox.clickOnCollExpButton(i);
        }

        checkbox.clickOnCheckboxButton(0);

        String expectedMessage = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        Assert.assertEquals(expectedMessage, checkbox.getTextMessage());

    }
}
