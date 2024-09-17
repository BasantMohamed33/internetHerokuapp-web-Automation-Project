package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField =By.id("username");
    private By PasswordField =By.id("password");
    private By LoginButton = By.className("radius");
    public LoginPage (WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }

    public SecureAreaPage clickButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}
