package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodsTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //Sayfa basliginin "Amazon" icerdigini test edin
        if (actualTitle.contains("Amazon")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        Thread.sleep(3000); //Bu bekleme java dan gelir, driver ne olursa olsun 3 saniye bekliyecek demektir

        /*
        Test uzmanları Thread.sleep() kullanmaktan kaçınmalıdır çünkü gereksiz beklemere neden olur.
         */

        //Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        //Sayfa url'inin "amazon" icerdigini test edin.
        if (actualUrl.contains("amazon")){
            System.out.println("TEST PASSED");
    }else {
        System.out.println("TEST FAILED");
    }

        //Sayfa handle degerini yazdirin
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("amazonWindowHandle = " + amazonWindowHandle);

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String ActualGateway= driver.getPageSource();
        if (ActualGateway.contains("Gateway")){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfayi kapatin.
        driver.close(); // en son driver in oldugu sayfayı kapatır

        // driver.quit(); Bizim otomasyon


    }
}
