package ru.levelup.tatiana.tatarinova.qa.homework_5.pages.base;

import org.openqa.selenium.WebDriver;

public abstract class BasePage extends BasePageComponent {

    protected BasePage(WebDriver driver) {
        super(driver);
    }

}
