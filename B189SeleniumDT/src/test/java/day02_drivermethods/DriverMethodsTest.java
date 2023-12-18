package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodsTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        String amazonUrl = "https://amazon.com";
        String techProUrl = "https://techproeducation.com";
        driver.get(amazonUrl);

        //Sayfa başlığını konsola yazdıralım
        String actualTitle = driver.getTitle();//methodu gidilen sayfanin basligini verir
        System.out.println("Amazon Sayfasinin baslik bilgisi = " + actualTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String actualUrl = driver.getCurrentUrl();//methodu gidilen sayfanin url ini verir
        System.out.println("Amazon sayfasi Url i = " + actualUrl);

        //Techproeducation sayfasına gidelim
        driver.get(techProUrl);

        //Sayfa başlığını konsola yazdıralım
        String techProEducationTitle = driver.getTitle();
        System.out.println("TechPro Sayfasinin baslik bilgisi = " + techProEducationTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String techProEducationUrl = driver.getCurrentUrl();
        System.out.println("TechPro sayfasi Url i = " + techProEducationUrl);




    }
}
