package ru.levelup.tatiana.tatarinova.qa.homework_5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(name="login")
    private WebElement loginTextField;

    @FindBy(name="password")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Авторизоваться']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void fillLoginTextField(String username) {
        loginTextField.sendKeys(username);
    }

    public void fillPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
    }

    public void loginButtonClick() {
        loginButton.click();
    }
}
