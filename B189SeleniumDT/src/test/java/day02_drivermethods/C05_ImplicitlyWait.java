package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ImplicitlyWait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");



        //sayfa başlığının TechPro Education olduğunu test ediniz
        String expectedTitle = "https://techproeducation.com";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.equals(expectedTitle) ? "TEST PASSED" : "TEST FAILED");

        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");


        //sayfa url'inin facebook içerdiğini test ediniz
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        // techpro sayfasına geri dönünüz
        driver.navigate().back();


        //Geri döndüğünüzü test ediniz
        if (actualTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //sayfayı kapatınız
        driver.close();




        //max 15 saniye sayfadaki web elementleri oluşması için bekler

        /*
        Bir sayfaya gittigimizde internetten kaynakli islem yapilmak istenen web elementler hemen olusmayabilir
        Dolayisiyla islem yapilmak istenen webelement henüz olusmamis ise kodlarimiz bu elementi bulamaz ve hata aliriz
        Bu nedenle implicitly wait kullanarak isimizin cogunu hallederiz, bazi extra beklemeler icin explicit wait konusuu ögreneceğiz
         */




    }
}
