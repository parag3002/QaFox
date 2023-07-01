package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader 
{
	     
	public static Properties PS;
	public static FileInputStream FIS_PS;
	
	
	public configReader() throws Exception
	{
		FIS_PS = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		PS = new Properties();
		PS.load(FIS_PS);
	}
	
	public static String readPS(String inputProperty) throws Exception
	{
		@SuppressWarnings("unused")
		configReader C = new configReader(); // calling the constructor in order to instantiate variables
		//System.err.println(System.getProperty("user.dir"));
		//System.out.println(PS.getProperty("browser"));
		return PS.getProperty(inputProperty);
	}
	
	
	
	/*
	public static void main(String args[]) throws Exception
	{
		System.out.println(configReader.readPS("browser"));
	}
	*/
	
	
}

//browser=chrome