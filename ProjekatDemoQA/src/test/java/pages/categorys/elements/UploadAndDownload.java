package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload extends ElementsPage{

    WebElement downloadButton;
    WebElement uploadFileButton;
    WebElement uploadedMessage;


    public UploadAndDownload(WebDriver driver) {
        super(driver);
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }

    public WebElement getUploadFileButton() {
        return driver.findElement(By.id("uploadFile"));
    }

    public WebElement getUploadedMessage() {
        return driver.findElement(By.id("uploadedFilePath"));
    }

    //    ----------------------------------------------------

    public void clickOnDownloadButton() {
        getDownloadButton().click();
    }

    public void uploadFile(String path) {
        getUploadFileButton().sendKeys(path);
    }

    public String uploadedMessage() {
        return getUploadedMessage().getText();
    }

}
