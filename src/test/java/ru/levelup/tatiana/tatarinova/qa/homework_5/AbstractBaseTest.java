package ru.levelup.tatiana.tatarinova.qa.homework_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.levelup.tatiana.tatarinova.qa.homework_5.dataProvider.ConfigFileReader;

import java.util.concurrent.TimeUnit;

public class AbstractBaseTest {

    protected ConfigFileReader configFileReader = new ConfigFileReader();
    protected WebDriver driver;

    @BeforeSuite
    public void setUpSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDownBrowser() {
        driver.quit();
    }
}
