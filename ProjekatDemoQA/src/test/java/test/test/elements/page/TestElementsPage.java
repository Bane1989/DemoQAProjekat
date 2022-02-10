package test.test.elements.page;

import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsPage extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
    }

    @Test(priority = 10)
    public void verifyThatAllButtonsWorking() {
        elementsPage.clickOnElementGroup(0);
        elementsPage.clickOnElement(1);
//        checkbox.clickOnCollExpButton(0);
//        checkbox.clickOnCollExpButton(1);
//        checkbox.clickOnCollExpButton(2);
//        checkbox.clickOnCollExpButton(3);
//        checkbox.clickOnCollExpButton(4);
//        checkbox.clickOnCollExpButton(5);
//        checkbox.clickOnCollExpButton(6);
//        waitToBeClickable(checkbox.getL().get(1));
//        checkbox.clickOnCheckboxButton(1);
        checkbox.getTextFromLabelOfCheckboxButton(1);
    }

    @Test(priority = 20)
    public void verifuThatEditOrDeleteButtonWorking() {
        elementsPage.clickOnElementGroup(0);
        scroll(elementsPage.getListOfElements().get(3));
        elementsPage.clickOnElement(3);
        webTables.clickOnEditButton(0);
    }

    @Test(priority = 30)
    public void verifyThatBrokenImageIsntDisplayed() {
        waitToBeVisible(elementsPage.getListOfElements().get(6));
        scroll(elementsPage.getListOfElements().get(6));
        elementsPage.clickOnElement(6);
        brokenLinksImages.brokenImage();
    }


}
