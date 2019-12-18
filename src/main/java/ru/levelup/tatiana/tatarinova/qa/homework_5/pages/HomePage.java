package ru.levelup.tatiana.tatarinova.qa.homework_5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement enterButton;

    @FindBy(xpath = "//a[@href='http://users.bugred.ru/']")
    private WebElement pageTitle;

    // Имя пользователя в правом верхнем углу
    @FindBy(id="fat-menu")
    private WebElement userButton;

    @FindBy(xpath = "//a[text()='Выход']")
    private WebElement logoutButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterButtonClick() {
        enterButton.click();
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String getUsername() {
        return userButton.getText();
    }

    public void userButtonClick(){
        userButton.click();
    }

    public void logoutButtonClick() {
        logoutButton.click();
    }


}
