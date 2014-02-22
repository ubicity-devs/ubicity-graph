

package at.ac.ait.ubicity.voodoo;

import at.ac.ait.ubicity.commons.protocol.Medium;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.VertexQuery;
import java.util.Set;

/**
 *
 * @author jan van oort
 * @param <T> The medium ( Twitter, Flickr ) for which this class depicts an edge, 
 * in that Medium's social graph
 */
public abstract class MediumVertex<T extends Medium > implements Vertex {

    public abstract Iterable<Edge> getEdges(Direction direction, String... labels);

    public abstract  Iterable<Vertex> getVertices(Direction direction, String... labels);

    public abstract VertexQuery query();

    public abstract Edge addEdge(String label, Vertex inVertex);

    public abstract <T> T getProperty(String key);

    public abstract Set<String> getPropertyKeys();

    public abstract void setProperty(String key, Object value);

    public abstract <T> T removeProperty(String key);

    public abstract void remove();

    public abstract Object getId();

}
