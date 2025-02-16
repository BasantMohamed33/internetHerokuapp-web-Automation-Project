package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

            public HomePage(WebDriver driver){
                    this.driver=driver;
            }
            public LoginPage clickFormAuthentication(){
                clickLink("Form Authentication");
                return new LoginPage(driver);
            }

            public DropdownPage clickDropDown(){
                clickLink("Dropdown");
                return new DropdownPage(driver);
            }

            public HoversPage clickHovers(){
                clickLink("Hovers");
                return new HoversPage(driver);
            }

            public KeyPressesPage clickKeyPresses(){
                clickLink("Key Presses");
                return new KeyPressesPage(driver);
            }

            public AlertsPage clickJavaScriptAlerts(){
                clickLink("JavaScript Alerts");
                return new AlertsPage(driver);
            }

            public FileUploadPage clickFileUpload(){
                clickLink("File Upload");
                return new FileUploadPage(driver);
            }

            public WysiwygEditorPage clickWysiwygEditor(){
                clickLink("WYSIWYG Editor");
                return new WysiwygEditorPage(driver);
            }

            public DynamicLoadedPage clickDynamicLoadedPage(){
                clickLink("Dynamic Loading");
                return new DynamicLoadedPage(driver);
            }

            public LargeAndDeepPage clickLargeAndDeepPage(){
                clickLink("Large & Deep DOM");
                return new LargeAndDeepPage(driver);
            }

             public MultipleWindows clickMultipleWindow(){
             clickLink("Multiple Windows");
                 return new MultipleWindows(driver);
            }


    private void clickLink(String LinkText){
                driver.findElement(By.linkText(LinkText)).click();
            }
}
