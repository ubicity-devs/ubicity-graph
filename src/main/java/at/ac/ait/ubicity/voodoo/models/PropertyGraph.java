package at.ac.ait.ubicity.voodoo.models;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Features;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.GraphQuery;
import com.tinkerpop.blueprints.Vertex;
import java.io.Serializable;

/**
 * A bridge between the <Tinkerpop> Graph and ubicity's MediumGraph. 
 * Although the Tinkerpop / Blueprints documentation repeatedly speaks of 
 * "property graphs", there is no class providing a centralized implementation
 * of such a concept. This class aims to provide in that deficiency.
 * 
 * NOTE: Although the Java language does not require it, all method signatures
 * from the Graph interface have been repeated here, for documentation purposes only.
 * 
 * @author jan van oort
 */
public abstract class PropertyGraph implements Graph, Serializable {

    @Override
    public abstract Features getFeatures();
        
    

    @Override
    public abstract Vertex addVertex(Object id);
        
    

    @Override
    public abstract Vertex getVertex(Object id);
        
    

    @Override
    public abstract void removeVertex(Vertex vertex);
        
    

    @Override
    public abstract Iterable<Vertex> getVertices();
        
    

    @Override
    public abstract Iterable<Vertex> getVertices(String key, Object value);
        
    
    @Override
    public abstract Edge addEdge(Object id, Vertex outVertex, Vertex inVertex, String label);
        
    

    @Override
    public abstract Edge getEdge(Object id);
        
    

    @Override
    public abstract void removeEdge(Edge edge);
        
    

    @Override
    public abstract Iterable<Edge> getEdges();
        
    

    @Override
    public abstract Iterable<Edge> getEdges(String key, Object value);
        
    

    @Override
    public abstract GraphQuery query();
        
    

    @Override
    public abstract void shutdown();
        
    

}
