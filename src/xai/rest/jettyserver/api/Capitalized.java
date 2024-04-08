package xai.rest.jettyserver.api;

import java.io.Serializable;

/**
 * @author Joan-Manuel Marques
 *
 */
public class Capitalized implements Serializable{
	private static final long serialVersionUID = 1L;

	String word;
	boolean modified;
	
	public Capitalized (String word, boolean modified){
		this.word = word;
		this.modified = modified;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitalized other = (Capitalized) obj;
		if (!word.equals(other.word))
			return false;
		if (modified != other.modified)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{word=" + word + ", modified=" + modified + "}";
	}
}
