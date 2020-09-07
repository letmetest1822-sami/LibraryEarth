package library.step_definitions;

import library.pages.LoginPage;
import library.utilities.BrowserUtils;
import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        //WebDriver driver = Driver.get();
        //driver.get(url);
        //instead of driver object we will use Driver.get() directly
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter the student information")
    public void the_user_enter_the_student_information() {
        String username = ConfigurationReader.get("student_username");
        String password = ConfigurationReader.get("student_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(8);


        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify title", "Dashboard", actualTitle);


    }

    @When("the user enter librarian information")
    public void the_user_enter_sales_manager_information() {
        String username = ConfigurationReader.get("librarian_username");
        String password = ConfigurationReader.get("librarian_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }



    /*
        @When("the user logs in using {string} and {string}")
        public void the_user_logs_in_using_and(String username, String password) {
            LoginPage loginPage = new LoginPage();
            loginPage.login(username,password);
        }
    */
    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
/*
    }
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String username) {

        String user = ConfigurationReader.get(username+ "_username");
        String pass = ConfigurationReader.get(username + "_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(user, pass);
    }

*/


    }
}
