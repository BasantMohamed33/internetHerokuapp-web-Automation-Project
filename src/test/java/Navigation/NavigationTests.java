package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
    homepage.clickDynamicLoadedPage().clickExample1();
    getWindowManager().goBack();
    getWindowManager().goRefresh();
    getWindowManager().goForward();
    getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitch (){
    homepage.clickMultipleWindow().clickHere();
    getWindowManager().SwitchToTab("New Window");
    }
}
