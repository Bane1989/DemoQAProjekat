package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links extends ElementsPage {

    WebElement homeLink;
    WebElement homepj0HzLink;
    WebElement createdLink;
    WebElement noContentLink;
    WebElement movedLink;
    WebElement badRequestLink;
    WebElement unauthorizedLink;
    WebElement forbiddenLink;
    WebElement notFoundLink;
    WebElement linkResponseMessage;

    public Links(WebDriver driver) {
        super(driver);
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getHomepj0HzLink() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContentLink() {
        return driver.findElement(By.id("no-content"));
    }

    public WebElement getMovedLink() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBadRequestLink() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorizedLink() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbiddenLink() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFoundLink() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getLinkResponseMessage() {
        return driver.findElement(By.id("linkResponse"));
    }

//    ------------------------------------------------------------

    public void clickOnHomelink() {
        getHomeLink().click();
    }

    public void clickOnHomepj0HzLink() {
        getHomepj0HzLink().click();
    }

    public void clickOnCreatedLink() {
        getCreatedLink().click();
    }

    public void clickOnNoContentLink() {
        getNoContentLink().click();
    }

    public void clickOnMovedLink() {
        getMovedLink().click();
    }

    public void clickOnBadRequestLink() {
        getBadRequestLink().click();
    }

    public void clickOnUnauthorizedLink() {
        getUnauthorizedLink().click();
    }

    public void clickOnForbiddenLink() {
        getForbiddenLink().click();
    }

    public void clickOnNotFoundLink() {
        getNotFoundLink().click();
    }

    public String responseMessage() {
        return getLinkResponseMessage().getText();
    }


}
