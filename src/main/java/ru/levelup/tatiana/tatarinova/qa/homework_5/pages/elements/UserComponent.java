package ru.levelup.tatiana.tatarinova.qa.homework_5.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.base.BasePageComponent;

public class UserComponent extends BasePageComponent {

    @FindBy(xpath = "//input[@name='act_create']")
    private WebElement createUserButton;

    @FindBy(xpath = "//input[@name='noibiz_name']")
    private WebElement nameTextField;

    @FindBy(xpath = "//input[@name='noibiz_email']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='noibiz_password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@name='noibiz_birthday']")
    private WebElement birthdayField;

    @FindBy(xpath = "//select[@name='noibiz_gender']//option[@value='m']")
    private WebElement genderButton;

    @FindBy(xpath = "//input[@name='noibiz_date_start']")
    private WebElement startDateField;

    @FindBy(xpath = "//textarea[@name='noibiz_hobby']")
    private WebElement hobbyTextField;

    public UserComponent(WebDriver driver) {
        super(driver);
    }

    public void fillNameTextField(String name) {
        nameTextField.sendKeys(name);
    }

    public void fillEmailTextField(String email) {
        nameTextField.sendKeys(email);
    }

    public void fillPasswordTextField(String password) {
        nameTextField.sendKeys(password);
    }

    public void fillBirthdayField(String birthday) {
        nameTextField.sendKeys(birthday);
    }

    public void fillStartDateField(String startDate) {
        nameTextField.sendKeys(startDate);
    }

    public void fillHobbyTextField(String hobby) {
        nameTextField.sendKeys(hobby);
    }

    public void genderButtonClick() {
        genderButton.click();
    }

    public void createUserButtonClick() {
        createUserButton.click();
    }



}

