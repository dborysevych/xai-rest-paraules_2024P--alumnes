package xai.rest.client;

import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
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
		
		Client client = ClientBuilder.newClient();
		  Response response = client
		                    .target("http://" + address + ":" + port + "/words/length/" + word)
		                    .request(MediaType.TEXT_PLAIN)
		                    .get();
		  
		  int result = response.readEntity(Integer.class);
		  response.close();
		  client.close();
		  return result;
	}
	
	public ArrayList<String> split(String address, int port, String word, String regex) {
		LSimLogger.log(Level.INFO, "split");
		LSimLogger.log(Level.INFO, "word: "+word);
		LSimLogger.log(Level.INFO, "regex: "+regex);
		
		Client client = ClientBuilder.newClient();
		Response response = client
	                    .target("http://" + address + ":" + port + "/words/split/" + word + "/" + regex)
	                    .request(MediaType.APPLICATION_JSON)		                    .get();
		  
		 Gson gson = new Gson();
		 String[] resultArray = gson.fromJson(response.readEntity(String.class), String[].class);
		 ArrayList<String> result = new ArrayList<>(Arrays.asList(resultArray));
		  
		 response.close();
		 client.close();
		 return result;
	}

	public Capitalized lower(String address, int port, String word) {
		LSimLogger.log(Level.INFO, "lower");
		LSimLogger.log(Level.INFO, "word: "+word);
		
		Client client = ClientBuilder.newClient();
		Response response = 
				client.target("http://" + address + ":" + port + "/words/toLowerCase/" + word)
	                    .request(MediaType.APPLICATION_JSON)
	                    .get();
		
		Gson gson = new Gson();
	    Capitalized result = gson.fromJson(response.readEntity(String.class),
	    				Capitalized.class);
		  
	    response.close();
	    client.close();
	    return result;
	}

}
