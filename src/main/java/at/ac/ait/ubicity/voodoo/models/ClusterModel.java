

package at.ac.ait.ubicity.voodoo.models;

/**
 *
 * @author jan van oort
 * @param <Graph> for which we want to compute a cluster model
 */
public interface ClusterModel<Graph> {

    
    public Cluster[] compute();
    
    
}
