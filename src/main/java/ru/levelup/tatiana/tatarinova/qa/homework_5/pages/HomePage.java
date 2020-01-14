package ru.levelup.tatiana.tatarinova.qa.homework_5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.base.BasePage;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.elements.UserComponent;

public class HomePage extends BasePage {

    private UserComponent userComponent;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement enterButton;

    @FindBy(xpath = "//a[@href='http://users.bugred.ru/']")
    private WebElement pageTitle;

    // Имя пользователя в правом верхнем углу
    @FindBy(id="fat-menu")
    private WebElement userNameButton;

    @FindBy(xpath = "//a[text()='Выход']")
    private WebElement logoutButton;

    @FindBy(xpath = "//a//span[text()='Задачи']")
    private WebElement taskButton;

    //счетчик задач
    @FindBy(xpath = "//a[@href='/tasks/notify/index.html']")
    private WebElement taskCounter;

    @FindBy(xpath = "//a//span[text()='Пользователи']")
    private WebElement usersButton;

    @FindBy(xpath = "//a[text()='Добавить пользователя']")
    private WebElement addUserButton;


    public HomePage(WebDriver driver) {
        super(driver);
        userComponent = new UserComponent(driver);
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

    public void enterButtonClick() {
        enterButton.click();
    }

    public void userNameButtonClick(){
        userNameButton.click();
    }

    public void tasksButtonClick() {
        taskButton.click();
    }

    //нажать кнопку "Пользователи"
    public void usersButtonClick() {usersButton.click();}

    public void addUserButtonClick() {
        addUserButton.click();
    }

    public void logoutButtonClick() {
        userNameButton.click();
        logoutButton.click();
    }


    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String getUsername() {
        return userNameButton.getText();
    }

    public String getTaskCounter() { return taskCounter.getText(); }

}
