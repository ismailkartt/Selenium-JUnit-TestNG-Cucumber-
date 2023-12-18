package day08_testbase_alert_iframe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_TestBaseClassWork extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        //   -3 farklı test methodu oluşturalım
        //       1.Method:
        //           a. Yil,ay,gün dropdown menu'leri locate ediniz
        //           b. Select objesi olustur
        //           c. Select object i kullaarak 3 farkli sekilde secim yapiniz

        // 1.Method:
        //           a. Yil,ay,gün dropdown menu'leri locate ediniz
        WebElement yil = driver.findElement(By.xpath("//select[@id='year']"));
        WebElement ay = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement gun = driver.findElement(By.xpath("//select[@id='day']"));

        selectIndex(yil,3);
        Thread.sleep(2000);

        selectVisible(ay,"May");
        Thread.sleep(2000);

        selectVisible(gun,"5");



    }


}
