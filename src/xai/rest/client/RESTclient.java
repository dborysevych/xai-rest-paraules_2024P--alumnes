package xai.rest.client;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;
import xai.rest.jettyserver.api.Capitalized;

/**
 * @author Joan-Manuel Marques
 *
 */

public class RESTclient {

	public int length(String address, int port, String word) {
		LSimLogger.log(Level.INFO, "length");
		LSimLogger.log(Level.INFO, "word: "+word);
		
		/* COMPLETE CODE */
		
		return Integer.MIN_VALUE;
	}
	
	public ArrayList<String> split(String address, int port, String word, String regex) {
		LSimLogger.log(Level.INFO, "split");
		LSimLogger.log(Level.INFO, "word: "+word);
		LSimLogger.log(Level.INFO, "regex: "+regex);
		
		/* COMPLETE CODE */
		
		return new ArrayList<String>();
	}

	public Capitalized lower(String address, int port, String word) {
		LSimLogger.log(Level.INFO, "lower");
		LSimLogger.log(Level.INFO, "word: "+word);
		
		/* COMPLETE CODE */
		
		return null;
	}

}
