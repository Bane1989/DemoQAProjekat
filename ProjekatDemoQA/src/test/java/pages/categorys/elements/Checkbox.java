package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkbox extends ElementsPage{

    WebElement expandAllButton;
    WebElement collapseAllButton;
    List<WebElement> listOfCollExpButtons;
    List<WebElement> listOfCheckboxButtons;
    List<WebElement> listOfMessages;


    public Checkbox(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfCollExpButtons() {
        return driver.findElement(By.id("tree-node")).findElements(By.className("rct-node-parent"));
    }

    public WebElement getExpandAllButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-expand-all"));
    }

    public WebElement getCollapseAllButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-collapse-all"));
    }

    public List<WebElement> getListOfMessages() {
        return driver.findElement(By.id("result")).findElements(By.className("text-success"));
    }

    //    ------------------------------------------------

    public void clickOnCollExpButton(int index) {
        getListOfCollExpButtons().get(index).findElement(By.tagName("button")).click();
    }

    public void clickOnCheckboxButton(int index) {
        getListOfCollExpButtons().get(index).findElement(By.tagName("label")).click();
    }

    public void getTextFromLabelOfCheckboxButton(int index) {
        getListOfCollExpButtons().get(index).findElement(By.className("rct-title")).getText();
    }

    public void clickOnExpandAllButton() {
        getExpandAllButton().click();
    }

    public void clickOnCollapseAllButton() {
        getCollapseAllButton().click();
    }

    public String getTextMessage() {
        String message = driver.findElement(By.id("result")).findElement(By.tagName("span")).getText();
        for (WebElement w : getListOfMessages())
        message += "\n" + w.getText();
        return message;
    }

}
