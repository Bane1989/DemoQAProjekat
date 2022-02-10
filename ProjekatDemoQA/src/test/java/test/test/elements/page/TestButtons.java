package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestButtons extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        scroll(elementsPage.getListOfElements().get(4));
        elementsPage.clickOnElement(4);
    }

    @Test(priority = 10)
    public void verifyThatUserCanClickOnAllButtonsAndMessageAppearsCorrectly() {
        buttons.doubleClick();
        buttons.rightClick();
        buttons.dynamicClick();

        String doubleClickMessage = "You have done a double click";
        String rightClickMessage = "You have done a right click";
        String dynaimicClickMessage = "You have done a dynamic click";

        Assert.assertEquals(doubleClickMessage, buttons.displayDoubleClickMessage());
        Assert.assertEquals(rightClickMessage, buttons.displayRightClickMessage());
        Assert.assertEquals(dynaimicClickMessage, buttons.displayDynamicClickMessage());
    }


}
