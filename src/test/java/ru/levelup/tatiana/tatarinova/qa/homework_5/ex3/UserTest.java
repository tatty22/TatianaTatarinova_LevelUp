package ru.levelup.tatiana.tatarinova.qa.homework_5.ex3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_5.AbstractBaseTest;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.HomePage;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.LoginPage;

public class UserTest extends AbstractBaseTest {

    //Добавление пользователя (добавление компании не работает на сайте)
    @Test
    public void addUserTest(){

        //Входим на сайт
        driver.get(configFileReader.getUrl());

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.enterButtonClick();
        loginPage.fillLoginTextField(configFileReader.getUserName());
        loginPage.fillPasswordTextField(configFileReader.getPassword());
        loginPage.loginButtonClick();

        //Добавляем пользователя
        homePage.usersButtonClick();
        homePage.addUserButtonClick();

        homePage.getUserComponent().fillNameTextField(configFileReader.getUserName());
        homePage.getUserComponent().fillEmailTextField(configFileReader.getEmail());
        homePage.getUserComponent().fillPasswordTextField(configFileReader.getNewPassword());
        homePage.getUserComponent().fillBirthdayField(configFileReader.getBirthday());
        homePage.getUserComponent().genderButtonClick();
        homePage.getUserComponent().fillStartDateField(configFileReader.getstartDate());
        homePage.getUserComponent().fillHobbyTextField(configFileReader.getHobby());
        homePage.getUserComponent().createUserButtonClick();

        //Выходим
        homePage.logoutButtonClick();
    }
}
