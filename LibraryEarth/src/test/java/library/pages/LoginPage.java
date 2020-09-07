package library.pages;

import library.utilities.ConfigurationReader;
import library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        public LoginPage(){
            PageFactory.initElements(Driver.get(),this);
        }

        @FindBy(xpath = "//label[contains(text(),'Email address')]")
        public WebElement usernameInput;

        @FindBy(xpath = "//label[contains(text(),'Password')]")
        public WebElement passwordInput;

        @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
        public WebElement loginBtn;

        public void login(String usernameStr,String passwordStr){

            usernameInput.sendKeys(usernameStr);
            passwordInput.sendKeys(passwordStr);
            loginBtn.click();

        }

        public void loginAsStudent(){
            String username = ConfigurationReader.get("student_username");
            String password = ConfigurationReader.get("dstudent_password");
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();

        }

        public void loginAsLibrarian(){
            String username = ConfigurationReader.get("librarian_username");
            String password = ConfigurationReader.get("librarian_password");
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();

        }

    }