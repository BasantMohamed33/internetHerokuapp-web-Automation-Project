package alerts;

import base.BaseTests;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var AlertsPage = homepage.clickJavaScriptAlerts();
        AlertsPage.triggerAlert();
        AlertsPage.alert_clickToAcceptAlert();
        assertEquals(AlertsPage.getResults(),"You successfully clicked an alert","results are not correct");

    }

    @Test
    public void testGetTextFromAlert (){
        var AlertsPage = homepage.clickJavaScriptAlerts();
        AlertsPage.setTriggerConfirmButton();
        String text = AlertsPage.alert_getText();
        AlertsPage.alert_clickToDissmissAlert();
        assertEquals(text,"I am a JS Confirm","Alertt test incorrect");
    }

    @Test
    public void testSetInputAlert(){
        var AlertsPage = homepage.clickJavaScriptAlerts();
        AlertsPage.setTriggerPromptButton();
        String text="TAU rocks!";
        AlertsPage.alert_setInput(text);
        AlertsPage.alert_clickToAcceptAlert();
        assertEquals(AlertsPage.getResults(),"You entered: " + text,"results incorrect");
    }

}