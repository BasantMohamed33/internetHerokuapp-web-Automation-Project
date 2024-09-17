package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin (){
       LoginPage loginPage = homepage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secueAreaPage =loginPage.clickButton();
       assertTrue(secueAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert test is incorrect");
    }

}
