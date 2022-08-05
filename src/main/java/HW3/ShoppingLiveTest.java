package HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingLiveTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shoppinglive.ru/");
        WebElement loginPage = driver.findElement(By.xpath("//div[@class=\"user-menu__item user-menu__item--account user-menu__account user-menu__account--log-in\"]"));
        loginPage.click();
        WebElement loginForm = driver.findElement(By.xpath("//*[@id=\"a0.9450550720993076a\"]"));
        loginForm.sendKeys("sweet_heart@internet.ru");
        driver.findElement(By.xpath("//*[@id=\"a0.47303945360603206a\"]")).sendKeys("v23v6766v");
        driver.findElement(By.xpath("//*[@id=\"login-email-form\"]/button")).click();


    }
}
