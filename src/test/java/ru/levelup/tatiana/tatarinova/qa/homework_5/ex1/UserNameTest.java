package ru.levelup.tatiana.tatarinova.qa.homework_5.ex1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_5.AbstractBaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UserNameTest extends AbstractBaseTest {

    //Проверка имени пользователя
    @Test
    public void checkUserNameTest() {
        //Проверяем название сайта
        driver.get("http://users.bugred.ru/");
        assertThat(driver.findElement(By.xpath("//a[@href='http://users.bugred.ru/']")).getText(),equalTo("Users"));


        //Входим на сайт
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys("tatty22@admin.ru");
        driver.findElement(By.name("password")).sendKeys("Qwerty12345");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        // Проверяем, что имя пользователя в правом верхнем углу корректно:
        assertThat(driver.findElement(By.id("fat-menu")).getText(),equalTo("tatty22"));

        //Выходим
        driver.findElement(By.id("fat-menu")).click();
        driver.findElement(By.xpath("//a[text()='Выход']")).click();
    }

}
