package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage  extends PageBase{
    public String title="Recruitment";
    By addButton=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    public RecruitmentPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddButton() {
        click(addButton);
    }
}
