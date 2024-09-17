package utlils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
   private WebDriver.Navigation navigate;
    public WindowManager (WebDriver driver){
        this.driver=driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        driver.navigate().back();
    }


    public void goForward(){
       driver.navigate().forward();
    }

    public void goRefresh(){
        driver.navigate().refresh();
    }

    public void goTo(String url){
      driver.navigate().to(url);
    }

    public void SwitchToTab(String tabTitle){
       var windows=driver.getWindowHandles();
        System.out.println("Number of tabs:"+windows.size());
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("switching to window"+window);
            driver.switchTo().window(window);

            System.out.println("current window title:"+driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
