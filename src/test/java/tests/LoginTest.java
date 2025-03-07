package tests;

import org.example.DashboardPage;
import org.example.LeavePage;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginTest extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    LeavePage leave;
    @BeforeMethod
    public void init(){
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        leave = new LeavePage(driver);
    }
    @Test
    public void loginWithValidUserNameAndPassword() throws InterruptedException {
        Thread.sleep(10000);
        loginPage.fillUserName("Admin");
        Thread.sleep(10000);
        loginPage.fillPassword("admin123");
        Thread.sleep(10000);
        loginPage.clickLoginButton();
        Thread.sleep(10000);
        Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.title);
        Thread.sleep(10000);

/*        dashboardPage.clickLeaveIconButton();
//        Thread.sleep(10000);
//        leave.fillEmployeeName("Ahmed");
//        Thread.sleep(10000);
//        leave.clickAssignButton();
//        Thread.sleep(10000);
//        Assert.assertEquals(leave.ActualResultForInvalid(),leave.invalid);
//        Thread.sleep(10000);

 */
    }


}
