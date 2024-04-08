package xai.rest.client.main;

import java.io.File;

import lsim.library.api.LSimLogger;
import xai.rest.client.RESTclient;

/**
 * @author Joan-Manuel Marques
 *
 */

public class RESTclientMain {
	private static final String IP_SERVIDOR = "localhost";
	private static final int PORT_SERVIDOR = 7070;
	
	public static void main(String[] args) throws Exception {
		LSimLogger.setLoggerAsLocalLogger("Rest_client", "." + File.separator + "logs" + File.separator, true);
		RESTclient rs = new RESTclient();
		
		String paraula = "Ephemeris";
		String regex = "e";
		System.out.println("len: " + rs.length(IP_SERVIDOR, PORT_SERVIDOR, paraula));
		System.out.println("spl: " + rs.split(IP_SERVIDOR, PORT_SERVIDOR, paraula, regex));
		System.out.println("low: " + rs.lower(IP_SERVIDOR, PORT_SERVIDOR, paraula));
	}
}
