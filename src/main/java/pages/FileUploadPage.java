package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inpupField= By.id("file-upload");
    private By uploadButton= By.id("file-submit");
    private By uploadedFiles= By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
   public void clickUploadButton(){
        driver.findElement(uploadButton).click();
   }
    /**
     * provide path to the form then click upload button
     * @param absolutePathOfFile the complete path of the file tp upload
     */
    public void uploadFile(String absolutePathOfFile ){
        driver.findElement(inpupField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

public String getUploaded(){
        return driver.findElement(uploadedFiles).getText();
}
}
