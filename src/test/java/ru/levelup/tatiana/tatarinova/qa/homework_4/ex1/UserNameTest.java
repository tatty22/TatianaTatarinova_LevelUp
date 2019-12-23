package ru.levelup.tatiana.tatarinova.qa.homework_4.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_4.AbstractBaseTest;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.HomePage;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserNameTest extends AbstractBaseTest {

    //Проверка имени пользователя
    @Test
    public void checkUserNameTest() {
        //Проверяем название сайта
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        assertThat(homePage.getPageTitle(),equalTo("Users"));
        LoginPage loginPage = new LoginPage(driver);

        //Входим на сайт
        homePage.enterButtonClick();

        loginPage.fillLoginTextField("tatty22@admin.ru");
        loginPage.fillPasswordTextField("Qwerty12345");
        loginPage.loginButtonClick();

        // Проверяем, что имя пользователя в правом верхнем углу корректно:
        assertThat(homePage.getUsername(),equalTo("tatty22"));

        //Выходим
        homePage.userNameButtonClick();
        homePage.logoutButtonClick();
    }

}
