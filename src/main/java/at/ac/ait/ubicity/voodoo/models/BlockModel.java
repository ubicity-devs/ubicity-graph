

package at.ac.ait.ubicity.voodoo.models;



/**
 *
 * @author jan van oort
 * @param <Graph> for which we want to compute a block model
 */
public interface BlockModel<Graph> {

    public Block[] compute();
}
