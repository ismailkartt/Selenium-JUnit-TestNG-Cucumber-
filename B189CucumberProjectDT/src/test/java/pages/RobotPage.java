package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RobotPage {

    /*
    PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki class memberlari webdriver ile eslestirir
    Bu sayede classtaki webelementlere erismek icin PageFactory e yardimci olan  @FindBy notasyonu kullanilabilir
    */
    public RobotPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[.='Select PDF files']")
    public WebElement selectButton;


    @FindBy(xpath="//span[.='Batch189upload.pdf']")
    public WebElement verify;


}
