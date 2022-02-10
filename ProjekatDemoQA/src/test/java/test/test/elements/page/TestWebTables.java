package test.test.elements.page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebTables extends BasePage {

   @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().window().maximize();
        scroll(elementsPage.getListOfElements().get(3));
        elementsPage.clickOnElement(3);
    }

    public void deleteEmployesFromTable() {
        for (int i = 0; i < 3; i++) {
            scroll(webTables.getListOfRowsGroups().get(0));
            webTables.clickOnDeleteButton(0);
        }
    }

    @Test(priority = 10)
    public void verifyThatUserCanCreateNewEmploye() {
       deleteEmployesFromTable();
       scroll(webTables.getAddButton());
        waitToBeClickable(webTables.getAddButton());
        webTables.clickOnAddButton();
        String firstName1 = excelReader.getStringData("Web Tables", 1, 0);
        String lastName1 = excelReader.getStringData("Web Tables", 1, 1);
        String email1 = excelReader.getStringData("Web Tables", 1, 2);
        int age1 = excelReader.getIntegerData("Web Tables", 1, 3);
        int salary1 = excelReader.getIntegerData("Web Tables", 1, 4);
        String department1 = excelReader.getStringData("Web Tables", 1, 5);

        webTables.inputFirstName(firstName1);
        webTables.inputLastName(lastName1);
        webTables.inputEmail(email1);
        webTables.inputAge(age1);
        webTables.inputSalary(salary1);
        webTables.inputDepartment(department1);

        webTables.clickOnSubmitButton();

        String actualFirstName = webTables.getListTableRows(0).get(0).getText();
        String actualLastName = webTables.getListTableRows(0).get(1).getText();
        String actualAge = webTables.getListTableRows(0).get(2).getText();
        String actualEmail = webTables.getListTableRows(0).get(3).getText();
        String actualSalary = webTables.getListTableRows(0).get(4).getText();
        String actualDepartment = webTables.getListTableRows(0).get(5).getText();

        Assert.assertEquals(firstName1, actualFirstName);
        Assert.assertEquals(lastName1, actualLastName);
        Assert.assertEquals(email1, actualEmail);
        Assert.assertEquals(String.valueOf(age1), actualAge);
        Assert.assertEquals(String.valueOf(salary1), actualSalary);
        Assert.assertEquals(department1, actualDepartment);
   }

   @Test(priority = 20)
    public void verifyThatUserCanSelect100RowsToBeDislpayed() {
       scroll(webTables.getListPageSizeDropdown());
       webTables.clickOnSelectNumberOfRowsOption(5);

       Assert.assertTrue(webTables.getListOfRowsGroups().size() == 100);
   }
}
