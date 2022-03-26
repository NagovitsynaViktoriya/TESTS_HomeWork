package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Case2 {
    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        //Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void test() {
        Selenide.open("https://www.mvideo.ru/");
        //$(By.xpath("//span[contains(@class,'location-text')]")).click();

        //Assert.assertTrue($(By.linkText("Товары дня")).isDisplayed());
    }

    @After
    public void q() {
        Selenide.sleep(300000);
        WebDriverRunner.closeWebDriver();
    }
}
