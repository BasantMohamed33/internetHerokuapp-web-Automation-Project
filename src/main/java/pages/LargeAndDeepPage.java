package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class LargeAndDeepPage {

    private WebDriver driver;
    private By table=By.id("large-table");


    public LargeAndDeepPage (WebDriver driver){
        this.driver=driver;
    }

    public void scrollToTable(){
        WebElement tableElement=driver.findElement(table);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",tableElement);
    }
}
