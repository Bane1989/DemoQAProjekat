package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.categorys.CategorysPage;

import java.util.List;

public class ElementsPage extends CategorysPage {

    List<WebElement> listOfElements;

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfElements() {
        return getListElementsGroup().get(0).findElements(By.tagName("li"));
    }

//    ------------------------------------------------------

    public void clickOnElement(int index) {
        getListOfElements().get(index).click();
    }

    public void clickOnElement(String element) {
        for (WebElement w : getListOfElements()) {
            if (element.equalsIgnoreCase(w.findElement(By.className("text")).getText())) {
                w.click();
            }
        }
    }

    public String getTextOfElement(int index) {
        return getListOfElements().get(index).findElement(By.className("text")).getText();
    }


}
