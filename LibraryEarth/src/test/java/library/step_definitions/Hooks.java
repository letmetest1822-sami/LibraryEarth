package library.step_definitions;

import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");

        String browser = ConfigurationReader.get("browser");
        if(!browser.contains("mobile")){
            Driver.get().manage().window().maximize();
        }
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /*
    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().window().maximize();
        //Driver.get().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");

        }
        Driver.closeDriver();
    }


}