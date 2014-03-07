/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.ait.ubicity.voodoo.impl;

import at.ac.ait.ubicity.commons.JSONObjectWrapper;
import junit.framework.TestCase;

/**
 *
 * @author vanOortJ
 */
public class VoodooEventHandlerTest extends TestCase {
    
    public VoodooEventHandlerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of onEvent method, of class VoodooEventHandler.
     */
    public void testOnEvent() throws Exception {
        System.out.println("onEvent");
        JSONObjectWrapper event = null;
        long sequence = 0L;
        boolean endOfBatch = false;
        VoodooEventHandler instance = new VoodooEventHandler();
        instance.onEvent(event, sequence, endOfBatch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
