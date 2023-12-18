package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GoogleStepDefinition {

    GooglePage googlePage = new GooglePage();

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @When("google arama kutusunda {string} aratir")
    public void googleAramaKutusundaAratir(String str) {
        googlePage.searchBox.sendKeys(str, Keys.ENTER);
    }

    @When("kullanici verilen bilgiler ile arama yapar")
    public void kullaniciVerilenBilgilerIleAramaYapar(DataTable data) {
        List<String> dataTableList = data.asList();

        for (int i=0; i< dataTableList.size(); i++){
            googlePage.searchBox.sendKeys(dataTableList.get(i) + Keys.ENTER);

            Assert.assertTrue(Driver.getDriver().getTitle().contains(dataTableList.get(i)));

            googlePage.searchBox.clear();
        }

    }

    @When("kullanici verilen bilgiler ile arama yapar ikinci yol")
    public void kullaniciVerilenBilgilerIleAramaYaparIkinciYol(List<String> list) {
        for (String w : list){
            googlePage.searchBox.sendKeys(w + Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(w));
            googlePage.searchBox.clear();
        }
    }
}
