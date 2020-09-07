package library.tests;

import library.pages.LoginPage;
import library.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {



    @Test
    public void loginTestAsDriver(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStudent();

        Assert.assertEquals(driver.getCurrentUrl(), ConfigurationReader.get("url"));
    }
    @Test
    public void loginTestAsSalesManager(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsLibrarian();

    }
}
