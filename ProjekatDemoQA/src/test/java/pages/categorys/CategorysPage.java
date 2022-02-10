package pages.categorys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class CategorysPage {

    public WebDriver driver;

    List<WebElement> listElementsGroup;
    WebElement katalonAd;
    WebElement lambdaTestAd;
    WebElement categoryName;

    public CategorysPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getListElementsGroup() {
        return driver.findElements(By.className("element-group"));
    }

    public WebElement getKatalonAd() {
        return driver.findElement(By.className("Katalon-Ad")).findElement(By.tagName("a"));
    }

    public WebElement getLambdaTestAd() {
        return driver.findElement(By.className("LambdaTest-Ad")).findElement(By.tagName("a"));
    }

    public WebElement getCategoryName() {
        return driver.findElement(By.className("main-header"));
    }

    abstract public List<WebElement> getListOfElements();

    //    ----------------------------------------------------


    public String getNameOfCategory(int index) {
        return getCategoryName().getText();
    }

    public void clickOnElementGroup(int index) {
        getListElementsGroup().get(index).click();
    }

}
