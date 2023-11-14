package curso_java.A2_ejercicios.A91_LOG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PruebaLogs {
	
	private static final Logger LOGGER = LogManager.getLogger(PruebaLogs.class); 
	
	public static void main(String[] args) {
		
		LOGGER.trace("Hola caracola");
		LOGGER.debug("debug");
		LOGGER.info("info");
		LOGGER.warn("warn");
		LOGGER.error("error");
		LOGGER.fatal("fatal");

	}

}
