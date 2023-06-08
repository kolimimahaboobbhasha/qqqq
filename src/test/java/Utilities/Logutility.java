package Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logutility {
	Logger logger=Logger.getLogger(Logutility.class);
	public void infomessage(String Message)
	{  
		PropertyConfigurator.configure("D:\\java and automation\\BashaCucumberFramework\\src\\test\\resources\\Log4j (1).properties");
		logger.info(Message);
	}

}
