package day11_actions_faker;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_ActionsTest extends TestBase {

    @Test
    public void test01() {


        //Google anasayfasına gidelim
        driver.get("https://google.com");

        //arama kutusunda shift tusuna basılı olarak selenium yazdıralım ve shift tuşunu serbest bırakarak java yazdıralım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        Actions actions= new Actions(driver);
        actions.keyDown(aramaKutusu, Keys.SHIFT).//Arama kutusunda shift tusuna basili tutar
                sendKeys("selenium").
                keyUp(Keys.SHIFT).//shift tusundan parmagini kaldir
                sendKeys(" - java",Keys.ENTER).
                perform();

    }


    @Test
    public void test02() {
        //Google anasayfasına gidelim
        driver.get("https://google.com");

        //arama kutusunda shift tusuna basılı olarak selenium yazdıralım ve shift tuşunu serbest bırakarak java yazdıralım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys(Keys.SHIFT,"selenium",Keys.SHIFT," - java",Keys.ENTER);

    }

       /*
       ÖDEV:
       //google sayfasına gidelim
       //Arama kutusuna "Selenium" yazın ve Enter tuşuna basın
       //Arattığımız kelimeyi arama kutusundan ctrl+x ile keselim
       //Tekrar google sayfasına gidip kestiğimiz kelimeyi ctrl+v ile yapıştırıp tekrar aratalım
        */

    @Test
    public void homework() {
        //google sayfasına gidelim
        driver.get("https://www.google.com");
        //Arama kutusuna "Selenium" yazın ve Enter tuşuna basın
        WebElement searchBox =driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium",Keys.ENTER);
        waitForSecond(2);
        //Arattığımız kelimeyi arama kutusundan ctrl+x ile keselim
        searchBox =driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys(Keys.CONTROL,"a");
        waitForSecond(2);
        searchBox.sendKeys(Keys.CONTROL,"x");
        waitForSecond(2);
        //Tekrar google sayfasına gidip kestiğimiz kelimeyi ctrl+v ile yapıştırıp tekrar aratalım
        driver.navigate().back();
        waitForSecond(2);
        searchBox =driver.findElement(By.name("q"));
        searchBox.sendKeys(Keys.CONTROL,"v",Keys.ENTER);
        waitForSecond(2);
    }

}
