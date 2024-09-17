package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadedPage {

    private WebDriver driver;
    private By linkExample = By.linkText("Example 1: Element on page that is hidden");
   // private String linkXpath_format=".//a[contains(text(), '%s')]";
    //private By link_Example1=By.xpath(String.format(linkXpath_format,"Example 1"));
    public DynamicLoadedPage(WebDriver driver){
        this.driver=driver;
    }

    public DynamicLoadedExample1Page clickExample1() {
        driver.findElement(linkExample).click();
        return new DynamicLoadedExample1Page(driver);
    }

    public void ClickEmample(){
        driver.findElement(linkExample).click();

    }

}