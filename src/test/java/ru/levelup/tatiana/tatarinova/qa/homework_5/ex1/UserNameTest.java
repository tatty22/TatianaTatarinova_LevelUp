package ru.levelup.tatiana.tatarinova.qa.homework_5.ex1;

import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_5.AbstractBaseTest;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.HomePage;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UserNameTest extends AbstractBaseTest {

    //Проверка имени пользователя
    @Test
    public void checkUserNameTest() {

        //Проверяем название сайта
        driver.get(configFileReader.getUrl());

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        assertThat(homePage.getPageTitle(),equalTo("Users"));

        //Входим на сайт
        homePage.enterButtonClick();
        loginPage.fillLoginTextField(configFileReader.getUserName());
        loginPage.fillPasswordTextField(configFileReader.getPassword());
        loginPage.loginButtonClick();

        // Проверяем, что имя пользователя в правом верхнем углу корректно:
        assertThat(homePage.getUsername(),equalTo("tatty22"));

        //Выходим
        homePage.logoutButtonClick();
    }

}
