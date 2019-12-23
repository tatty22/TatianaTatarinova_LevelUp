package ru.levelup.tatiana.tatarinova.qa.homework_5.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageComponent {

    protected WebDriver driver;

    protected BasePageComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
