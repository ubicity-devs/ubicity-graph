

package at.ac.ait.ubicity.voodoo;

import at.ac.ait.ubicity.commons.protocol.Medium;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import java.util.Set;

/**
 *
 * @author jan van oort
 * @param <T> The medium ( Twitter, Flickr ) for which this class depicts an edge, 
 * in that Medium's social graph
 * 
 */
public abstract class MediumEdge<T extends Medium > implements Edge {

    
    public abstract  Vertex getVertex(Direction direction) throws IllegalArgumentException;

    public abstract  String getLabel();

    public abstract  <T> T getProperty(String key);

    public abstract Set<String> getPropertyKeys();

    public abstract void setProperty(String key, Object value);

    public abstract <T> T removeProperty(String key);

    public abstract void remove();

    public abstract Object getId();

}
