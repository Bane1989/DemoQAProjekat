package base;

import excel.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import pages.categorys.elements.*;
import pages.homepage.HomePage;

import java.io.IOException;
import java.time.Duration;
public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public Textbox textbox;
    public Checkbox checkbox;
    public RadioButton radioButton;
    public WebTables webTables;
    public Buttons buttons;
    public Links links;
    public BrokenLinksImages brokenLinksImages;
    public UploadAndDownload uploadAndDownload;
    public DynamicProperties dynamicProperties;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("C:\\Users\\brank\\IdeaProjects\\ProjekatDemoQA\\DemoQAProjekat.xlsx");
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        textbox = new Textbox(driver);
        checkbox = new Checkbox(driver);
        radioButton = new RadioButton(driver);
        webTables = new WebTables(driver);
        buttons = new Buttons(driver);
        links = new Links(driver);
        brokenLinksImages = new BrokenLinksImages(driver);
        uploadAndDownload = new UploadAndDownload(driver);
        dynamicProperties = new DynamicProperties(driver);
    }

    public void waitToBeClickable(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitToBeVisible(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
