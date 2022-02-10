package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    WebDriver driver;

    WebElement logo;
    WebElement banner;
    List<WebElement> categoryCards;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogo() {
        return driver.findElement(By.tagName("header")).findElement(By.tagName("a"));
    }

    public WebElement getBanner() {
        return driver.findElement(By.className("banner-image"));
    }

    public List<WebElement> getCategoryCards() {
        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
    }

//    --------------------------------------------------

    public void clickOnLogo() {
        getLogo().click();
    }

    public void clickOnBanner() {
        getBanner().click();
    }

    public void clickOnCard(int index) {
        getCategoryCards().get(index).click();
    }

    public void clickOnCard(String card) {
        for (WebElement w : getCategoryCards()) {
            if (card.equalsIgnoreCase(w.findElement(By.tagName("h5")).getText())) {
                w.click();
            }
        }
    }

    public String getCardText(int index) {
        return getCategoryCards().get(index).getText();
    }



}
