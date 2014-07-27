import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test
{
	public static Logger logger = LogManager.getRootLogger();
	
	static{
		PropertyConfigurator.configureAndWatch("log4j.properties");
	}
	public static void main(String[] args)
	{
		IOException ioe = new IOException("XMPP Error");
		System.out.println("Start");
		long before = System.currentTimeMillis();
		for(int i=0;i<50;i++)
		{
			logger.debug("test", ioe);
		}
		System.out.println("Timelapse: " + (System.currentTimeMillis() - before));
	}

}
