

package at.ac.ait.ubicity.voodoo;

import at.ac.ait.ubicity.commons.exceptions.ExceptionHandler;
import at.ac.ait.ubicity.commons.protocol.Medium;
import org.codehaus.jettison.json.JSONObject;


/**
 *
 * @author jan van oort
 * @param <T> this Framer's implementation target, e.g. Twitter
 */

public interface Framer< T extends Medium >{
    
    
    
    public MediumEdge<T> attemptEdge( JSONObject o );

    public MediumEdge<T> attemptEdge( JSONObject o, ExceptionHandler exceptionCallback );
    
    public MediumVertex<T> attemptVertex( JSONObject o );
    
    public MediumVertex<T> attemptVertex( JSONObject o, ExceptionHandler exceptionCallback );
    
    public Class<T> getMedium();
    
}
