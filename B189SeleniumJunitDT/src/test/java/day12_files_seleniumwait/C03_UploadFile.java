package day12_files_seleniumwait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_UploadFile extends TestBase {


    @Test
    public void uploadTest() {

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        WebElement choosFile=driver.findElement(By.id("file-upload"));

        //Yuklemek istediginiz dosyayi secelim.
        //"C:\Users\mua\Downloads\b10 all test cases, code.docx"

        //dynamic olmayan yol
        String dosyaYolu="C:\\Users\\mua\\Downloads\\b10 all test cases, code.docx";

        //dynamic olan yol
        String dynamicPath =System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";

        choosFile.sendKeys(dynamicPath);

        waitForSecond(2);


        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        waitForSecond(2);

        //"File Uploaded!" textinin goruntulendigini test edelim.

        String actualText = driver.findElement(By.xpath("//h3")).getText();
        String expectedText="File Uploaded!";
        Assert.assertEquals(expectedText,actualText);
        waitForSecond(2);

    }


}
