package day04_webelements_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {

    public static void main(String[] args) throws InterruptedException {
        //X Path

        /*
        / => bu direkt bir cocugu secer
            /html/body


        //=> Bu belgenin herhangi bir yerindeki bir elementi secmek icin kullanilir
            //div

        @ => Bir webelmentin attributee unu secmek icin kullanilir
            //input[@name='field-keywords']

        []=> kosullar veya index belirtmek icin kullanilir
            //input [2]

        * Hepsini secer

        SYNTAX

        //tagname [@attributeName ='attributeDegeri']
        //* [@* = 'attributedegeri' ]
        -> eger bu kullanimda birden fazla sonuc verirse * koydugumuz yerlere tagname ve attributename i belirtebiliriz
        -> buna ragmen birden fazla sonuc verirse o webelementin indexini asagidaki sekilde alabiliriz

        (//tagname [@attributeName ='attributeDegeri']) [index]

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Arama kutusunda “city bike” aratin (arama kutusunu xpath ile locate edin)
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type = 'text' ]"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucu = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(aramaSonucu.getText());//1-16 of 270 results for "city bike"


        //Sadece sonuc sayısını yazdırınız
        String [] sonucsayisi = aramaSonucu.getText().split(" ");
        System.out.println("sonucsayisi = " + sonucsayisi[2]);


        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        //=>xpath alirken direkt taglari kullanarak unique sonuc vermezse yukarid yaptigimiz gibi index ile locate edebiliriz
        //önemli olan uniqe elde etmektir

        Thread.sleep(3000);


        //sayfayi kapatınız
        driver.close();






    }

}
