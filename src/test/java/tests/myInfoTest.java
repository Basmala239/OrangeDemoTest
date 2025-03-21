package tests;

import org.example.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class myInfoTest extends TestBase{
    DashboardPage dashboardPage;
    myInfoPage infoPage;
    @BeforeMethod
    public void init(){
        dashboardPage = new DashboardPage(driver);
        infoPage= new myInfoPage(driver);
    }
    public void emptyFirstName() throws InterruptedException{
        infoPage.fillFirstName("");
        Thread.sleep(5000);
        infoPage.clickSaveButton();
        Thread.sleep(5000);
        Assert.assertEquals(infoPage.emptyFirstNameError(),infoPage.required);
        Thread.sleep(5000);
    }
    public void emptyLastName() throws InterruptedException{
        infoPage.fillLastName("");
        Thread.sleep(5000);
        infoPage.clickSaveButton();
        Thread.sleep(5000);
    }
    public void emptyMedName() throws InterruptedException{
        infoPage.fillMiddleName("");
        Thread.sleep(5000);
        infoPage.clickSaveButton();
        Thread.sleep(5000);
    }
    public void changeGender() throws InterruptedException{
        infoPage.chooseGender(false);
        Thread.sleep(5000);
        infoPage.clickSaveButton();
        Thread.sleep(5000);
    }
    public void resetName() throws InterruptedException{
        infoPage.fillFirstName("abc");
        Thread.sleep(5000);
        infoPage.fillMiddleName("def");
        Thread.sleep(5000);
        infoPage.fillLastName("ghi");
        Thread.sleep(5000);
        infoPage.clickSaveButton();
        Thread.sleep(5000);
    }
}
