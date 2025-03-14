package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends PageBase {
    public String title="Dashboard";
    By LeaveIconButton=By.xpath("(//*[@title=\"Assign Leave\"])[1]");
    By RecruitmentButton=By.xpath("(//a[@class=\"oxd-main-menu-item\"])[5]");
    By actualResult=By.xpath("//*[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String ActualResultAssert(){
        return getText(actualResult);
    }

    public void clickLeaveIconButton() {
        click(LeaveIconButton);
    }

    public void clickRecruitmentButton() {
        click(RecruitmentButton);
    }
}
