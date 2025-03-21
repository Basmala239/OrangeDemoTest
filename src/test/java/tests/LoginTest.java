package tests;

import org.example.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginTest extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    LeavePage leave;
    RecruitmentPage recruitmentPage;
    CandidatePage candidatePage;
    myInfoPage infoPage;
    @BeforeMethod
    public void init(){
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        leave = new LeavePage(driver);
        recruitmentPage = new RecruitmentPage(driver);
        candidatePage = new CandidatePage(driver);
        infoPage= new myInfoPage(driver);
    }
    @Test
    public void loginWithValidUserNameAndPassword() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.fillUserName("Admin");
        Thread.sleep(5000);
        loginPage.fillPassword("admin123");
        Thread.sleep(5000);
        loginPage.clickLoginButton();
        Thread.sleep(5000);
        Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.title);
        Thread.sleep(5000);

//        dashboardPage.clickRecruitmentButton();
//        dashboardPage.clickLeaveIconButton();
//        Thread.sleep(5000);
//        leave.clickAssignButton();
//        Thread.sleep(10000);
//        Assert.assertEquals(leave.ActualResultForInvalid(),leave.invalid);
//        Thread.sleep(10000);
//        dashboardPage.clickRecruitmentButton();

//        recruitmentPage.clickAddButton();
//        Thread.sleep(5000);
//        candidatePage.fillFullName("Basmala");
//        Thread.sleep(5000);
//        candidatePage.fillMiddleName("Abuzied");
//        Thread.sleep(5000);
//        candidatePage.fillLastName("Ahmed");
//        Thread.sleep(5000);
//        candidatePage.clickSaveButton();
//        Thread.sleep(5000);

        dashboardPage.clickMyInfoIconButton();
        Thread.sleep(5000);




    }


}
