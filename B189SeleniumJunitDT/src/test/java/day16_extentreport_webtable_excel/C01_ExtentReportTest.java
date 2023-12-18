package day16_extentreport_webtable_excel;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_ExtentReportTest extends TestBase {


    @Test
    public void extentReusableFormatTest() {

        rapor("Chrome","AmazonTesti");


        //Amazon SearchBox adında yeni bir test olusturduk ve aciklama olarak ust baslık ıcın TestSteps yazdik
        extentTest = extentReports.createTest("Amazon SearchBox","Test Steps");

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();
        extentTest.info("Kullanici Amazon anasayfasına gider");

        //Arama kutusunda selenium aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium", Keys.ENTER);
        extentTest.info("Arama kutusunda selenium yazılarak aratıldı");

        //Sayfa basliginin selenium icerdigini doğrulayalim
        Assert.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("Sayfa baslıgının selenium icerdigi dogrulandı");

        extentReports.flush();

    }

}
