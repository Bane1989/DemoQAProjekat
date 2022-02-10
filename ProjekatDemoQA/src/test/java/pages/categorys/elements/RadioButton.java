package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton extends ElementsPage{

    List<WebElement> listOfRadioButtons;
    WebElement successMessage;

    public RadioButton(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfRadioButtons() {
        return driver.findElements(By.className("custom-control-label"));
    }

    public WebElement getSucessMessage() {
        return driver.findElement(By.className("text-success"));
    }

    //    -------------------------------------------------------

    public void clickOnRadioButton(int index) {
        getListOfRadioButtons().get(index).click();
    }

    public String getTextOfRadioButton(int index) {
        return getListOfRadioButtons().get(index).getText();
    }


}
