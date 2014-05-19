package at.ac.ait.ubicity.voodoo.models;

import java.io.Serializable;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Features;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.GraphQuery;
import com.tinkerpop.blueprints.Vertex;

/**
 * A bridge between the <Tinkerpop> Graph and ubicity's MediumGraph. Although
 * the Tinkerpop / Blueprints documentation repeatedly speaks of
 * "property graphs", there is no class providing a centralized implementation
 * of such a concept. This class aims to provide in that deficiency.
 * 
 * NOTE: Although the Java language does not require it, all method signatures
 * from the Graph interface have been repeated here, for documentation purposes
 * only.
 * 
 * @author jan van oort
 */
public abstract class PropertyGraph implements Graph, Serializable {

	private static final long serialVersionUID = 1L;

	public abstract Features getFeatures();

	public abstract Vertex addVertex(Object id);

	public abstract Vertex getVertex(Object id);

	public abstract void removeVertex(Vertex vertex);

	public abstract Iterable<Vertex> getVertices();

	public abstract Iterable<Vertex> getVertices(String key, Object value);

	public abstract Edge addEdge(Object id, Vertex outVertex, Vertex inVertex,
			String label);

	public abstract Edge getEdge(Object id);

	public abstract void removeEdge(Edge edge);

	public abstract Iterable<Edge> getEdges();

	public abstract Iterable<Edge> getEdges(String key, Object value);

	public abstract GraphQuery query();

	public abstract void shutdown();
}
