import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
public class SelenideExample {
    @BeforeClass
    void init(){
        Configuration.baseUrl = "https://www.simbirsoft.com";
        Configuration.timeout = 100;
    }

    @Test
    public void test1(){
        open("/");
        $(By.cssSelector("a[class=\"gh-tools-feedback write-to-us\"]"))
                .shouldBe(visible)
                .shouldHave(text("Написать нам"))
                .click();
        $x("//*[@class='fmo-parent']//*[@class='fb-modal-default]").shouldBe(visible);
        sleep(5000);
    }

    @Test
    public void test2(){
        open("/");
        $(By.xpath("//*[contains(@class, 'gh-nav-item--about')]"))
                .shouldHave(text("О нас"))
                .hover();
        $(By.linkText("Контакты"))
                .shouldHave(text("Контакты"))
                .click();
        $(By.xpath("//h1")).shouldBe(visible);
        webdriver().shouldHave(url("https://www.simbirsoft.com/contacts/"));
        sleep(5000);
    }
}
