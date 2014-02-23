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

import at.ac.ait.ubicity.commons.protocol.Medium;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.VertexQuery;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author jan van oort
 * @param <T> The medium ( Twitter, Flickr ) for which this class depicts an edge, 
 * in that Medium's social graph
 */
public abstract class MediumVertex<T extends Medium > implements Vertex, Serializable {

    public abstract Iterable<Edge> getEdges(Direction direction, String... labels);

    public abstract  Iterable<Vertex> getVertices(Direction direction, String... labels);

    public abstract VertexQuery query();

    public abstract Edge addEdge(String label, Vertex inVertex);

    public abstract <T> T getProperty(String key);

    public abstract Set<String> getPropertyKeys();

    public abstract void setProperty(String key, Object value);

    public abstract <T> T removeProperty(String key);

    public abstract void remove();

    public abstract Object getId();

}
