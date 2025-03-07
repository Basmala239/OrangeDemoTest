package tests;

import org.example.LeavePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class LeaveTest extends TestBase {
    LeavePage leave;
    DashboardTest dashboard;

    @BeforeMethod
    public void init(){
        leave = new LeavePage(driver);
        dashboard = new DashboardTest();
    }

    public void checkInvalidEmployeeName() throws InterruptedException{
        Thread.sleep(30000);
        leave.fillEmployeeName("Ahmed");
        Thread.sleep(10000);
        Assert.assertEquals(leave.ActualResultForInvalid(),leave.invalid);
        Thread.sleep(10000);
    }
}
