package day05_xpath_cssselector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C04_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //Berlin'i relative locator ile locate edin

        WebElement NYCWebElemenet = driver.findElement(By.id("pid3_thumb"));
        WebElement bayAreaWebelement= driver.findElement(By.cssSelector("#pid8_thumb"));
        WebElement berlinWebelement =driver.findElement(with(By.tagName("img")).below(NYCWebElemenet).toLeftOf(bayAreaWebelement));
        berlinWebelement.click();


        //Relative locator'larin dogru calistigini test edin
        String actualIdDegeri = berlinWebelement.getAttribute("id");
        String expectedIdDegeri ="pid7_thumb";
        System.out.println(actualIdDegeri.equals(expectedIdDegeri) ? "TEST PASSED" : "TEST FAILED");


        Thread.sleep(3000);
        //sayfayı kapatınız
        driver.close();

    }
}
