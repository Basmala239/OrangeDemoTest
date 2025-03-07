package helper;

import org.example.DashboardPage;
import org.example.LoginPage;
import org.testng.Assert;
import tests.TestBase;
public class LoginHelper {
    LoginPage loginPage = new LoginPage(TestBase.driver);
    DashboardPage dashboardPage = new DashboardPage(TestBase.driver);

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
    }


}
