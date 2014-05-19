/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.ait.ubicity.voodoo.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.SortedSet;

import org.junit.Ignore;
import org.junit.Test;

import at.ac.ait.ubicity.commons.JSONObjectHandler;

/**
 *
 * @author vanOortJ
 */
public class VoodooAddOnImplTest {

	/**
	 * Test of getDeclaredEventHandlers method, of class VoodooAddOnImpl.
	 */
	@Ignore
	@Test
	public void testGetDeclaredEventHandlers() {
		System.out.println("getDeclaredEventHandlers");
		VoodooAddOnImpl instance = new VoodooAddOnImpl();
		SortedSet<Class<? extends JSONObjectHandler>> expResult = null;
		SortedSet<Class<? extends JSONObjectHandler>> result = instance
				.getDeclaredEventHandlers();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to
		// fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of shutDown method, of class VoodooAddOnImpl.
	 */
	@Ignore
	@Test
	public void testShutDown() {
		System.out.println("shutDown");
		VoodooAddOnImpl instance = new VoodooAddOnImpl();
		boolean expResult = false;
		boolean result = instance.shutDown();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to
		// fail.
		fail("The test case is a prototype.");
	}

}
