package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hook {

    /*
    hooks classi ile scenariolardan once veya sonra calismasini istedigimiz kodlari
    io.cucumber.java.Before VE io.cucumber.java.After methodlari sayesinde yapariz
    Eger sadece istedigimiz scenariodan once calismasini istedigimiz bir kod olursa @Before notasyonu parantezi icine tagi belirtiriz
    Eger sadece istedigimiz scenariodan sonra calismasini istedigimiz bir kod olursa @After notasyonu parantezi icine tagi belirtiriz
    Dolayisiyla bu sekilde sadece tagi belirttigimiz scenariodan once veya sonra calistirilir
     */

    @Before
    public void setUp() throws Exception {
        System.out.println("Hook classindaki @Before methodu her test scenariosundan once calistirilir");
    }

    @Before("@honda")
    public void setUp2() throws Exception {
        System.out.println("sadece @honda tagi olan scenariolardan once calistirilir");
    }

    @After("@toyota")
    public void tearDown2() throws Exception {
        System.out.println("sadece @toyota tagi olan scenariolardan sonra calistirilir");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if( scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario"+scenario.getName());
            Driver.closeDriver();
        }
    }



    }




