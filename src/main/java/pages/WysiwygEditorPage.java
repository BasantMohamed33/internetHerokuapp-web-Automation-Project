package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId="mce_0_ifr";
    private By textArea=By.id("tinymce");

    public  WysiwygEditorPage(WebDriver driver){
        this.driver=driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void clearTextArea(){
       switchToEditArea();
       driver.findElement(textArea).clear();
       switchToMainArea();
    }


    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }


    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }


}
