/**
    Copyright (C) 2014  AIT / Austrian Institute of Technology
    http://www.ait.ac.at

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/agpl-3.0.html
 */
package at.ac.ait.ubicity.voodoo.impl;

import java.util.Random;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import net.xeoh.plugins.base.annotations.events.Init;
import net.xeoh.plugins.base.annotations.events.Shutdown;

import org.apache.log4j.Logger;

import at.ac.ait.ubicity.commons.broker.events.EventEntry;
import at.ac.ait.ubicity.commons.util.PropertyLoader;
import at.ac.ait.ubicity.core.Core;
import at.ac.ait.ubicity.voodoo.VoodooAddOn;

@PluginImplementation
public class VoodooAddOnImpl implements VoodooAddOn {

	private String name;

	private Core core;

	private int uniqueId;

	protected static Logger logger = Logger.getLogger(VoodooAddOnImpl.class);

	@Override
	@Init
	public void init() {
		uniqueId = new Random().nextInt();

		PropertyLoader config = new PropertyLoader(
				VoodooAddOnImpl.class.getResource("/voodoo.cfg"));
		this.name = config.getString("addon.voodoo.name");

		core = Core.getInstance();
		core.register(this);
	}

	@Override
	public final int hashCode() {
		return uniqueId;
	}

	@Override
	public final boolean equals(Object o) {

		if (VoodooAddOnImpl.class.isInstance(o)) {
			VoodooAddOnImpl other = (VoodooAddOnImpl) o;
			return other.uniqueId == this.uniqueId;
		}
		return false;
	}

	@Override
	@Shutdown
	public void shutdown() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void onEvent(EventEntry event, long sequence, boolean endOfBatch)
			throws Exception {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
