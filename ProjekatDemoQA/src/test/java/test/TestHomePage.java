package test;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class TestHomePage extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com");
        driver.manage().window().maximize();
    }

    @Test(priority = 10)
    public void verifyThatClickOnLogoRedirectUserToHomePage() {
        String hompageURL = "https://demoqa.com/";
        homePage.clickOnLogo();
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(hompageURL, actualURL);
    }

    @Test(priority = 20)
    public void verifyThatClickOnBannerRedirectUserToSeleniumTrainingPage() {
        String expectedURL = "https://www.toolsqa.com/selenium-training/";
        homePage.clickOnBanner();
        ArrayList<String> listOfTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfTabs.get(1));
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

    }

    @Test(priority = 30)
    public void verifyThatClickOnCardElementRedirectUserToPageWithSameNameAsCard() {

            for (int i = 0; i < homePage.getCategoryCards().size(); i++) {
                scroll(homePage.getCategoryCards().get(i));
                String cardText = homePage.getCardText(i);
                homePage.clickOnCard(i);
                waitToBeClickable(homePage.getLogo());
                String elementText = elementsPage.getNameOfCategory(i);
                System.out.println(checkbox.getTextOfElement(0));
                homePage.clickOnLogo();
                Assert.assertEquals(cardText, elementText);
            }
        }


}


