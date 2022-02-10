package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Buttons extends ElementsPage{

    List<WebElement> listOfButtons;
    WebElement doubleClickMessage;
    WebElement rightClickMessage;
    WebElement dynamicClickMessage;

    Actions act = new Actions(driver);

    public Buttons(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfButtons() {
        return driver.findElements(By.className("btn-primary"));
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getDynamicClickMessage() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

//    ------------------------------------------------------------

    public void doubleClick() {
        act.doubleClick(getListOfButtons().get(0)).perform();
    }

    public void rightClick() {
        act.contextClick(getListOfButtons().get(1)).perform();
    }

    public void dynamicClick() {
        getListOfButtons().get(2).click();
    }

    public String displayDoubleClickMessage() {
        return getDoubleClickMessage().getText();
    }

    public String displayRightClickMessage() {
        return getRightClickMessage().getText();
    }

    public String displayDynamicClickMessage() {
        return getDynamicClickMessage().getText();
    }
}
