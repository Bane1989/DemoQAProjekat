package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUploadAndDownload extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        scroll(elementsPage.getListOfElements().get(7));
        elementsPage.clickOnElement(7);
    }

    @Test(priority = 10)
    public void verifyThatUserCanUploadFile() {
        uploadAndDownload.uploadFile("C:\\Users\\brank\\Desktop\\DemoQAProjekat.xlsx");

        String expectedMessage = "C:\\fakepath\\DemoQAProjekat.xlsx";
        String actualMessage = uploadAndDownload.uploadedMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
