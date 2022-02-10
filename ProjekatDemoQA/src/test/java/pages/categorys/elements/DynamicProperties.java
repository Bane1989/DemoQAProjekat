package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicProperties extends ElementsPage{

    WebElement enableAfter;
    WebElement colorChange;
    WebElement visibleAfter;

    public DynamicProperties(WebDriver driver) {
        super(driver);
    }

    public WebElement getEnableAfter() {
        return driver.findElement(By.id("enableAfter"));
    }

    public WebElement getColorChange() {
        return driver.findElement(By.id("colorChange"));
    }

    public WebElement getVisibleAfter() {
        return driver.findElement(By.id("visibleAfter"));
    }

//    -----------------------------------------------------

    public boolean isEnableAfterButton() {
        return getEnableAfter().isEnabled();
    }

    public boolean getTextColorOfColorChangeButton() {
        return getColorChange().getCssValue("color").equals("#fff");
    }


    public  boolean isVisibleAfterButton() {
        return  getVisibleAfter().isDisplayed();
    }


}
