/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.ait.ubicity.voodoo.impl;

import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

import at.ac.ait.ubicity.commons.addon.JSONObjectWrapper;

/**
 *
 * @author vanOortJ
 */
public class VoodooEventHandlerTest {

	/**
	 * Test of onEvent method, of class VoodooEventHandler.
	 */
	@Ignore
	@Test
	public void testOnEvent() throws Exception {
		System.out.println("onEvent");
		JSONObjectWrapper event = null;
		long sequence = 0L;
		boolean endOfBatch = false;
		VoodooEventHandler instance = new VoodooEventHandler();
		instance.onEvent(event, sequence, endOfBatch);
		// TODO review the generated test code and remove the default call to
		// fail.
		fail("The test case is a prototype.");
	}

}
