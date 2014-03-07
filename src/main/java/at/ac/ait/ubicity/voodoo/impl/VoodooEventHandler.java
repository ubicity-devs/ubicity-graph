

package at.ac.ait.ubicity.voodoo.impl;

import at.ac.ait.ubicity.commons.JSONObjectHandler;
import at.ac.ait.ubicity.commons.JSONObjectWrapper;
import com.lmax.disruptor.EventHandler;

/**
 *
 * @author jan
 */
public class VoodooEventHandler extends JSONObjectHandler {

    @Override
    public void onEvent(JSONObjectWrapper event, long sequence, boolean endOfBatch) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
