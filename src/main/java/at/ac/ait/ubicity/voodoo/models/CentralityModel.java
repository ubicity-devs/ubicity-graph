
package at.ac.ait.ubicity.voodoo.models;

/**
 *
 * @author User
 * @param <Graph> for which we want to compute a centrality model
 */
public interface CentralityModel<Graph> {
    
    
    public Centrality[] compute();
}
