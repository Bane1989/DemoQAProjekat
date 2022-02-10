package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenLinksImages extends ElementsPage{

    List<WebElement> listOfImages;
    List<WebElement> listOfLinks;


    public BrokenLinksImages(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfImages() {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6")).findElements(By.tagName("img"));
    }

    public List<WebElement> getListOfLinks() {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6")).findElements(By.tagName("a"));
    }

//    -------------------------------------------------------

    public boolean validImage() {
        return getListOfImages().get(0).isDisplayed();
    }


    public boolean brokenImage() {
        return getListOfImages().get(1).isDisplayed();
    }

    public void clickOnValidLink() {
        getListOfLinks().get(0).click();
    }

    public void clickOnInvalidLink() {
        getListOfLinks().get(1).click();
    }


}
