import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
public class MyExample {
    private final Logger logger = LoggerFactory.getLogger(MyExample.class);

    @BeforeClass
    void init(){
        logger.info("поехали");
        Configuration.baseUrl = "https://promo-z.ru/";
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
    }

    @DataProvider(name = "header")
    public static Object[][] headerProvider(){
        return new Object[][]{
                {"Проекты","/projects"},
                {"Услуги","/services"},
                {"Вакансии","/vacancies"},
                {"Карьера","/career"},
                {"О нас","/about"},
                {"Контакты","/contacts"}
        };
    }

    @DataProvider(name = "services")
    public static Object[] servicesProvider(){
        return new Object[]{
                "/it-product",
                "/game",
                "/outstaffing",
                "/outsourcing",
                "/testing",
                "/design",
                "/development-mobile-app",
                "/development-1c",
                "/saving-product",
                "/it-product",
                "/modernization",
                "/analysis",
        };
    }

    @Test(description = "вкладки шапки", dataProvider = "header")
    void test1(String text, String url){
        open("/");
        $(By.xpath(String.format("//header//a[text()='%s']", text))).click();
        webdriver().shouldHave(urlContaining(url));
        sleep(3000);
    }

    @Test(description = "Тестируем вкладки услуг", dataProvider = "services")
    void test2(String url){
        open("/services");
        $(By.xpath(String.format("//a[@href='%s']", url))).click();
        $(By.xpath("//div")).shouldBe(visible);
        webdriver().shouldHave(urlContaining(url));
        sleep(4000);
    }
}
