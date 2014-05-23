package at.ac.ait.ubicity.voodoo;

import org.json.JSONObject;

import at.ac.ait.ubicity.commons.protocol.Medium;
import at.ac.ait.ubicity.voodoo.exc.ExceptionHandler;

/**
 *
 * @author jan van oort
 */
public abstract class TwitterFramer implements Framer<Medium> {

	@Override
	public abstract MediumEdge<Medium> attemptEdge(JSONObject o);

	public abstract MediumEdge<Medium> attemptEdge(JSONObject o,
			ExceptionHandler exceptionCallback);

	@Override
	public abstract MediumVertex<Medium> attemptVertex(JSONObject o);

	public abstract MediumVertex<Medium> attemptVertex(JSONObject o,
			ExceptionHandler exceptionCallback);

	@Override
	public Medium getMedium() {
		return Medium.TWITTER;
	}

}
