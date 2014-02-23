

package at.ac.ait.ubicity.voodoo;

import at.ac.ait.ubicity.commons.exceptions.ExceptionHandler;
import at.ac.ait.ubicity.commons.protocol.Medium;
import org.json.JSONObject;

/**
 *
 * @author jan van oort
 */
public abstract class TwitterFramer implements Framer< Medium > {

    @Override
    public abstract MediumEdge<Medium> attemptEdge(JSONObject o);
        
    

    @Override
    public abstract MediumEdge<Medium> attemptEdge(JSONObject o, ExceptionHandler exceptionCallback);
        
    

    @Override
    public abstract MediumVertex<Medium> attemptVertex(JSONObject o);
        
    

    @Override
    public abstract MediumVertex<Medium> attemptVertex(JSONObject o, ExceptionHandler exceptionCallback );
        
    

    @Override
    public Medium getMedium()   {
        return Medium.TWITTER;
    }
        
    

}
