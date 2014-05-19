package at.ac.ait.ubicity.voodoo;

import org.json.JSONObject;

import at.ac.ait.ubicity.commons.exceptions.ExceptionHandler;
import at.ac.ait.ubicity.commons.protocol.Medium;

/**
 *
 * @author jan van oort
 */
public abstract class TwitterFramer implements Framer<Medium> {

	public abstract MediumEdge<Medium> attemptEdge(JSONObject o);

	public abstract MediumEdge<Medium> attemptEdge(JSONObject o,
			ExceptionHandler exceptionCallback);

	public abstract MediumVertex<Medium> attemptVertex(JSONObject o);

	public abstract MediumVertex<Medium> attemptVertex(JSONObject o,
			ExceptionHandler exceptionCallback);

	public Medium getMedium() {
		return Medium.TWITTER;
	}

}
