package ru.levelup.tatiana.tatarinova.qa.homework_5.ex2;

import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_5.AbstractBaseTest;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.HomePage;
import ru.levelup.tatiana.tatarinova.qa.homework_5.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TaskCounterTest extends AbstractBaseTest {

    //Проверка счетчика задач
    @Test
    public void checkTaskCounterTest() {

        //Входим на сайт
        driver.get(configFileReader.getUrl());

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.enterButtonClick();
        loginPage.fillLoginTextField(configFileReader.getUserName());
        loginPage.fillPasswordTextField(configFileReader.getPassword());
        loginPage.loginButtonClick();

        //Добавляем задачу
        homePage.tasksButtonClick();
        //Пока не работает (баг на сайте):
        //driver.findElement(By.xpath("//a[text()='Добавить задачу']")).click();

        //Проверяем счетчик задач (должен быть установлен в 0, т.к. добавление не работает):
        assertThat(homePage.getTaskCounter(),containsString("0"));

        //Выходим
        homePage.logoutButtonClick();


    }
}
