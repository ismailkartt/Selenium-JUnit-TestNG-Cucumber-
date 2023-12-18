package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;

public class DataTableStepDefinition {

    DataTablePage dataTablePage = new DataTablePage();

    @And("kullanici sayfadaki new butonuna basar")
    public void kullaniciSayfadakiNewButonunaBasar() {
        dataTablePage.newButton.click();
    }

    @And("kullanici verilen bilgileri girer {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void kullaniciVerilenBilgileriGirer(String name, String lastName, String position, String office, String extension, String date, String salary) {
        dataTablePage.firstName.sendKeys(name,
                Keys.TAB,lastName,
                Keys.TAB,position,
                Keys.TAB,office,
                Keys.TAB,extension,
                Keys.TAB,date,
                Keys.TAB,salary
        );
    }

    @And("create butonuna basar")
    public void createButonunaBasar() {
        dataTablePage.createButton.click();
    }

    @And("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String name) {
        dataTablePage.searchName.sendKeys(name);
    }

    @Then("kullanici {string} ile basarili bir kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirKayitYapildiginiDogrular(String firstName) {
        Assert.assertTrue(dataTablePage.firstCell.getText().contains(firstName));
    }
}
