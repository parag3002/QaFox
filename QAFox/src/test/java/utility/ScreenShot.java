package utility;
import base.*;
import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class ScreenShot extends baseClass
{

	ScreenShot() throws Exception
	{
		
	}
	
	//@Test
	public static void captureSS() throws Exception
	{
		Date SSDate = new Date();
		String ssFileName = SSDate.toString().replace(" ", "_").replace(":", "_");
		File screenshotFile = ((TakesScreenshot) D).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\test-output\\ScreenShot\\"+ssFileName+".png"));
		
	}
	
	
}


