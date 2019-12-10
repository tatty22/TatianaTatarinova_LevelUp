package ru.levelup.tatiana.tatarinova.qa.homework_4.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ru.levelup.tatiana.tatarinova.qa.homework_4.AbstractBaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class TaskCounterTest extends AbstractBaseTest {

    @Test
    public void checkTaskCounterTest(){
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("login")).sendKeys("tatty22@admin.ru");
        driver.findElement(By.name("password")).sendKeys("Qwerty12345");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        driver.findElement(By.xpath("//a//span[text()='Задачи']")).click();
        //Пока не работает (баг):
        //driver.findElement(By.xpath("//a[text()='Добавить задачу']")).click();

        WebElement taskCounter = driver.findElement(By.xpath("//a[@href='/tasks/notify/index.html']"));
        assertThat(taskCounter.getText(),containsString("0"));


        driver.findElement(By.id("fat-menu")).click();
        driver.findElement(By.xpath("//a[text()='Выход']")).click();


    }
}
