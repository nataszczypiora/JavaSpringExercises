package loggin.settings;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyLoggerConfig {
	private String rootLoggerLevel;
	private String printedLoggerLevel;
	
	public String getRootLoggerLevel() {
		return rootLoggerLevel;
	}
	public void setRootLoggerLevel(String rootLoggerLevel) {
		this.rootLoggerLevel = rootLoggerLevel;
	}
	public String getPrintedLoggerLevel() {
		return printedLoggerLevel;
	}
	public void setPrintedLoggerLevel(String printedLoggerLevel) {
		this.printedLoggerLevel = printedLoggerLevel;
	}
	
	public void initLogger()
	{
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level printLevel = Level.parse(printedLoggerLevel);
		
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
		
		Logger loggerParent = applicationContextLogger.getParent();
		loggerParent.setLevel(rootLevel);
		
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(printLevel);
		consoleHandler.setFormatter(new SimpleFormatter());
		
		loggerParent.addHandler(consoleHandler);
	}
	
}
