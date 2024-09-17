package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileuploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage=homepage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/LenOvo/IdeaProjects/internetHerokuapp/resources/bossy.txt");
        assertEquals(uploadPage.getUploaded(),"bossy.txt","incorrect");
    }
}
