package testCase;


import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Log4j_Implement
{
	private static Logger demoLogger = LogManager.getLogger(Log4j_Implement.class.getName());

	@Test
	public void testListnerLogReportPass() throws Exception
	{
		
		System.out.println("PARAG");
		demoLogger.info("Testcase pass");
		demoLogger.error("DB Fail");
		demoLogger.debug("Debug process");
		demoLogger.fatal("fatal error");
		
		System.out.println("Login by email--->");
		Assert.assertEquals("Parag", "Parag");
		

	}
	
	@Test
	public void testListnerLogReportFail()
	{
		
		System.out.println("Login by Facebook--->");
		try
		{
			Assert.assertEquals("Parag","Vickey");
		}
		catch (Exception e)
		{
	
		}
		

	}
	
	
}
