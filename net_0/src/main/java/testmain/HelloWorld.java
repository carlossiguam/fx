package testmain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorld.class);
		logger.info("Este es un ejemplo de log en log info");
	}

}
