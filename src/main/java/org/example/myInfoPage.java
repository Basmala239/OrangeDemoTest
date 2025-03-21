package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myInfoPage extends PageBase{
    public String required="Required";
    By firstName = By.xpath("//input[@name=\"firstName\"]");
    By middleName = By.xpath("//input[@name=\"middleName\"]");
    By lastName = By.xpath("//input[@name=\"lastName\"]");
    By employeeId = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By otherId = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    By DriverLicenseNumber = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[4]");
    By LicenseExpiryDate= By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[5]");
    By Nationality = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[6]");
    By MaritalStatus= By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[7]");
    By DateOfBirth= By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[8]");
    By GenderMale= By.xpath("(//*[@class=\"oxd-radio-wrapper\"])[1]");
    By GenderFemale= By.xpath("(//*[@class=\"oxd-radio-wrapper\"])[2]");
    By saveButton= By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]");
    By requireError=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");

    public myInfoPage(WebDriver driver) {
        super(driver);
    }

    public void fillFirstName(String firstName) {
        sendKeys(this.firstName,firstName);
    }

    public void fillMiddleName(String middleName) {
        sendKeys(this.middleName,middleName);
    }

    public void fillLastName(String lastName) {
        sendKeys(this.lastName,lastName);
    }

    public void fillEmployeeId(String employeeId) {
        sendKeys(this.employeeId,employeeId);
    }

    public void fillOtherId(String otherId) {
        sendKeys(this.otherId,otherId);
    }

    public void fillDriverLicenseNumber(String driverLicenseNumber) {
        sendKeys(this.DriverLicenseNumber,driverLicenseNumber);
    }

    public void fillLicenseExpiryDate(String licenseExpiryDate) {
        sendKeys(this.LicenseExpiryDate,licenseExpiryDate);
    }

    public void fillNationality(String nationality) {
        sendKeys(this.Nationality,nationality);
    }

    public void fillMaritalStatus(String maritalStatus) {
        sendKeys(this.MaritalStatus,maritalStatus);
    }

    public void fillDateOfBirth(String dateOfBirth) {
        sendKeys(this.DateOfBirth,dateOfBirth);
    }

    public void chooseGender(boolean male) {
        if(male)
            click(this.GenderMale);
        else
            click(this.GenderFemale);
    }

    public void clickSaveButton() {
        click(this.saveButton);
    }
    public String emptyFirstNameError() {
        return getText(this.requireError);
    }

}
