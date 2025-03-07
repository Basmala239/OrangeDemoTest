package tests;

import helper.LoginHelper;
import org.example.DashboardPage;
import org.example.LeavePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest extends TestBase {
    DashboardPage dashboardPage;
    LeavePage leavePage;
    @BeforeMethod
    public void init(){
        dashboardPage = new DashboardPage(driver);
        leavePage = new LeavePage(driver);
    }
    @Test
    public void gotoApplyLeave() throws InterruptedException {
        dashboardPage.clickLeaveIconButton();
        Thread.sleep(10000);
        Assert.assertEquals(leavePage.ActualResultAssert(),leavePage.title);
        Thread.sleep(10000);
    }

}
