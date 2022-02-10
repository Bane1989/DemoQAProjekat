package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Textbox extends ElementsPage{

    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;
    List<WebElement> listOfMessages;

    public Textbox(WebDriver driver) {
        super(driver);
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public List<WebElement> getListOfMessages() {
        return driver.findElement(By.id("output")).findElements(By.tagName("p"));
    }

    //    ---------------------------------------------------

    public void inputFullName(String name) {
        getFullName().clear();
        getFullName().sendKeys(name);
    }

    public void inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress) {
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(currentAddress);
    }

    public void inputPermanentAddress(String premanentAddress) {
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(premanentAddress);
    }

    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }

    public String outputTextOfInput(int index) {
        String outputText = getListOfMessages().get(index).getText();
        int indexOfChar = outputText.indexOf(":");
        return outputText.substring(indexOfChar + 1);
    }


}
