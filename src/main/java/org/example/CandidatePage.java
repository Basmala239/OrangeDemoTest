package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CandidatePage extends PageBase{
    By fullName=By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]");
    By middleName=By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]");
    By lastName=By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]");
    By vacancy=By.xpath("//div[@class=\"oxd-select-text-input\"]");
    By email=By.xpath("//input[@class=\"oxd-input oxd-input--active oxd-input--error\"]");
    By contactNumber=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    //By Resume=By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]");
    By keywords=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    By dateOfApplication=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[4]");
    By notes=By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]");
    By saveButton=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    By cancelButton=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]");
    public CandidatePage(WebDriver driver) {
        super(driver);
    }
    public void fillFullName(String fullName) {
        sendKeys(this.fullName,fullName);
    }
    public void fillMiddleName(String middleName) {
        sendKeys(this.middleName,middleName);
    }
    public void fillLastName(String lastName) {
        sendKeys(this.lastName,lastName);
    }
    public void fillVacancy(String vacancy) {
        selectFromDropDown(this.vacancy,vacancy);
    }
    public void fillEmail(String email) {
        sendKeys(this.email,email);
    }
    public void fillContactNumber(String contactNumber) {
        sendKeys(this.contactNumber,contactNumber);
    }
    public void fillKeywords(String keywords) {
        sendKeys(this.keywords,keywords);
    }
    public void fillDateOfApplication(String dateOfApplication) {
        sendKeys(this.dateOfApplication,dateOfApplication);
    }
    public void fillNotes(String notes) {
        sendKeys(this.notes,notes);
    }
    public void clickSaveButton() {
        click(saveButton);
    }
    public void clickCancelButton() {
        click(cancelButton);
    }
}
