package pages.categorys.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables extends ElementsPage{

    WebElement addButton;
    WebElement searchInputField;
    List<WebElement> listTableHeaderElements;
    List<WebElement> listTableRowElements;
    List<WebElement> listOfRowsGroups;
    List<WebElement> listTableRows;
    List<WebElement> spanButton;
    WebElement previousButton;
    WebElement nextButton;
    WebElement pageJumpInput;
    WebElement listPageSizeDropdown;

//    ----------------------
    WebElement closeButton;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submitButton;

    public WebTables(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getSearchInputField() {
        return driver.findElement(By.id("searchBox"));
    }

    public List<WebElement> getListTableHeaderElements() {
        return driver.findElements(By.className("rt-th"));
    }

    public List<WebElement> getListOfRowsGroups() {
        return driver.findElements(By.className("rt-tr-group"));
    }

    public List<WebElement> getListTableRows(int index) {
        return getListOfRowsGroups().get(index).findElements(By.className("rt-td"));
    }

    public List<WebElement> getSpanButton(int index) {
        return getListTableRows(index).get(6).findElements(By.tagName("span"));
    }

    public WebElement getPreviousButton() {
        return driver.findElement(By.className("-previous")).findElement(By.tagName("button"));
    }

    public WebElement getNextButton() {
        return driver.findElement(By.className("-next")).findElement(By.tagName("button"));
    }

    public WebElement getPageJumpInput() {
        return driver.findElement(By.className("-center")).findElement(By.tagName("input"));
    }

    public WebElement getListPageSizeDropdown() {
        return driver.findElement(By.className("-pageSizeOptions"));
    }

//    ---------------------------------------------------------


    public WebElement getCloseButton() {
        return driver.findElement(By.className("close"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void clickOnSelectNumberOfRowsOption(int index) {
        List<WebElement> listOfOptions = getListPageSizeDropdown().findElements(By.tagName("option"));
        listOfOptions.get(index).click();
    }


    //    ----------------------------------------------------------------

    public void clickOnAddButton() {
        getAddButton().click();
    }

    public void inputSearch(String search) {
        getSearchInputField().sendKeys(search);
    }

    public void clickOnEditButton(int index) {
        getSpanButton(index).get(0).click();
    }

    public void clickOnDeleteButton(int index) {
            getSpanButton(index).get(1).click();
    }

    public void clickOnPreviousButton() {
        getPreviousButton().click();
    }

    public void clickOnNextButton() {
        getNextButton().click();
    }

    public void inputPageJump(int jumpTo) {
        getPageJumpInput().sendKeys(String.valueOf(jumpTo));
    }

    public void clickOnCloseButton() {
        getCloseButton().click();
    }

    public void inputFirstName(String firstName) {
        getFirstName().sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        getLastName().sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void inputAge(int age) {
        getAge().sendKeys(String.valueOf(age));
    }

    public void inputSalary(int salary) {
        getSalary().sendKeys(String.valueOf(salary));
    }

    public void inputDepartment(String department) {
        getDepartment().sendKeys(department);
    }

    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }





}
