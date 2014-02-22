
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


package at.ac.ait.ubicity.voodoo;

import at.ac.ait.ubicity.commons.exceptions.ExceptionHandler;
import at.ac.ait.ubicity.commons.protocol.Medium;
import org.json.JSONObject;



/**
 *
 * @author jan van oort
 * @param <T> this Framer's implementation target, e.g. Twitter
 */

public interface Framer< T extends Medium >{
    
    
    
    public MediumEdge<T> attemptEdge( JSONObject o );

    public MediumEdge<T> attemptEdge( JSONObject o, ExceptionHandler exceptionCallback );
    
    public MediumVertex<T> attemptVertex( JSONObject o );
    
    public MediumVertex<T> attemptVertex( JSONObject o, ExceptionHandler exceptionCallback );
    
    public Class<T> getMedium();
    
}
