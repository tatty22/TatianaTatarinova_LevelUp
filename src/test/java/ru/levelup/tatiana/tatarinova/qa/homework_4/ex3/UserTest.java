package ru.levelup.tatiana.tatarinova.qa.homework_4.ex3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_4.AbstractBaseTest;

public class UserTest extends AbstractBaseTest {
    @Test
    public void addUserTest(){
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("login")).sendKeys("tatty22@admin.ru");
        driver.findElement(By.name("password")).sendKeys("Qwerty12345");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        driver.findElement(By.xpath("//a//span[text()='Пользователи']")).click();
        driver.findElement(By.xpath("//a[text()='Добавить пользователя']")).click();
        driver.findElement(By.xpath("//input[@name='noibiz_name']")).sendKeys("Юрий Ломако");
        driver.findElement(By.xpath("//input[@name='noibiz_email']")).sendKeys("fff1235@mail.ru");
        driver.findElement(By.xpath("//input[@name='noibiz_password']")).sendKeys("Qwerty12345");
        driver.findElement(By.xpath("//input[@name='noibiz_birthday']")).sendKeys("22.09.1985");
        driver.findElement(By.xpath("//select[@name='noibiz_gender']//option[@value='m']")).click();
        driver.findElement(By.xpath("//input[@name='noibiz_date_start']")).sendKeys("28.11.2019");
        driver.findElement(By.xpath("//textarea[@name='noibiz_hobby']")).sendKeys("28.11.2019");
        driver.findElement(By.xpath("//input[@name='act_create']")).click();
    }
}
