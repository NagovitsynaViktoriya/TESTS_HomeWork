package test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Case1 {

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void test() {
        Selenide.open("https://www.mvideo.ru/");
        //Assert.assertTrue($(By.xpath("//mvid-header-icon[contains(@class, 'tab-status-order')]")).isDisplayed());

        $(By.xpath("//div[contains(@class, 'tab-profile')]")).click();
        Assert.assertTrue($(By.xpath("//h2[contains(@class, 'login-form__header')]")).shouldHave(text("Вход или регистрация")).isDisplayed());


        Assert.assertTrue($(By.xpath("//div[contains(@class, 'tab-compare')]")).isDisplayed());
        Assert.assertEquals("disabled", $(By.xpath("//div[contains(@class, 'tab-compare')]//mvid-header-icon")).attr("class"));

        Assert.assertTrue($(By.xpath("//div[contains(@class, 'tab-personal')]")).isDisplayed());
        Assert.assertEquals("disabled", $(By.xpath("//div[contains(@class, 'tab-personal')]//mvid-header-icon")).attr("class"));

        Assert.assertTrue($(By.xpath("//div[contains(@class, 'tab-cart')]")).isDisplayed());
        Assert.assertEquals("disabled", $(By.xpath("//div[contains(@class, 'tab-cart')]//mvid-header-icon")).attr("class"));

    }

    @After
    public void q() {
        WebDriverRunner.closeWebDriver();
    }
}
