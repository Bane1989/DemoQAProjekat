package pages.categorys.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.categorys.CategorysPage;

import java.util.List;

public class
FormsPage extends CategorysPage {

    List<WebElement> listOfElements;

    public FormsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfElements() {
        return getListElementsGroup().get(1).findElements(By.tagName("li"));
    }

//    ------------------------------------------------------

    public void clickOnElement(int index) {
        getListOfElements().get(index).click();
    }

    public void getTextOfElement(int index) {
        getListOfElements().get(index).findElement(By.className("text")).getText();
    }


}
