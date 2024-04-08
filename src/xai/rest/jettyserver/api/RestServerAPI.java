package xai.rest.jettyserver.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;

/**
 * @author Joan-Manuel Marques
 *
 */

@Path("/words")
public class RestServerAPI {

	/**
	 * length
	 *
	 * @param word
	 * @return
	 */
	@GET
	@Path("/length/{paraula}")
	@Produces(MediaType.TEXT_PLAIN)
	public String length(@PathParam("paraula") String paraula) {
		LSimLogger.log(Level.INFO, "length");
		LSimLogger.log(Level.INFO, "word: " + paraula);

		int resultat = -1;
		
		/* COMPLETE CODE */	

		LSimLogger.log(Level.INFO, "response: "+(new Integer(resultat)).toString());
		return (new Integer(resultat)).toString();
	}

	/**
	 * Splits a word
	 *
	 * @param word
	 * @param char
	 * @return
	 */
	@GET
	@Path("/split/{paraula}/{regex}")
	@Produces(MediaType.APPLICATION_JSON)
	public String split(@PathParam("paraula") String paraula, @PathParam("regex") String regex) {
		LSimLogger.log(Level.INFO, "split");
		LSimLogger.log(Level.INFO, "word: "+paraula);
		LSimLogger.log(Level.INFO, "regex: "+regex);

		Object resultat = null;
		Gson gson = null;
		
		/* COMPLETE CODE */	
		
		LSimLogger.log(Level.INFO, "response: "+gson.toJson(resultat));
		return gson.toJson(resultat);
	}

	/**
	 * toLowerCase
	 *
	 * @param word
	 * @return a json object containing the parameters and the result
	 */
	@GET
	@Path("/toLowerCase/{paraula}")
	@Produces(MediaType.APPLICATION_JSON)
	public String toLowerCase (@PathParam("paraula") String paraula) {
		LSimLogger.log(Level.INFO, "capitalize");
		LSimLogger.log(Level.INFO, "word: "+paraula);

		Capitalized resultat = null;
		Gson gson = null;
		
		/* COMPLETE CODE */

		LSimLogger.log(Level.INFO, "response: "+gson.toJson(resultat));
		return gson.toJson(resultat);
	}
}
