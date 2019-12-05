package com.ibm.ceh.demo.logging;

import java.util.Date;
import java.util.logging.Logger;

public class LoggingUtil implements LoggingUtilI {

	private static final Logger log = Logger.getLogger(LoggingUtil.class.getName());

	public long startLog(String className,String methodName){
		long startTime = System.currentTimeMillis();
		log.info("***" +new Date(startTime)+" " + "Entering in Method :  "
				+className+"."+ methodName + "()");
		return startTime;
	}
	
	public void endLog(long startTime,String className,String methodName){
		Long elapsedTime = System.currentTimeMillis() - startTime;
		log.info("Method execution time for API " +className+"."+ methodName+"()"+ " : " + elapsedTime + " milliseconds.");
	}
}