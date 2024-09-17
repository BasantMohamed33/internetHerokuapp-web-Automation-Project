package houver;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class HouverTests extends BaseTests {
    @Test
    public void testHoverUser(){
        var hoversPage = homepage.clickHovers();
        var caption =hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(),"caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","caption is not correct");
        assertEquals(caption.getlinkText(),"View profile","caption LinkText is not correct");
        assertTrue(caption.getlink().endsWith("/users/1"),"link incorrect");
    }

}
