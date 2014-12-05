package at.ac.ait.ubicity.tinkerpop;

import java.util.function.Function;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tinkerpop.gremlin.process.T;
import com.tinkerpop.gremlin.process.Traverser;
import com.tinkerpop.gremlin.process.graph.GraphTraversal;
import com.tinkerpop.gremlin.structure.Element;
import com.tinkerpop.gremlin.structure.Graph;
import com.tinkerpop.gremlin.structure.Vertex;
import com.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;

public class TinkerpopTest {

	// static Graph g = Neo4jGraph.open("C:\\temp\\neo4j");

	static Graph g = TinkerGraph.open();

	@Ignore
	@BeforeClass
	public static void setup() {
		Vertex marko = g.addVertex(T.label, "marko", "email", "marko@net.at",
				"age", 29);
		Vertex vadas = g.addVertex(T.label, "vadas", "email", "vadas@net.at",
				"age", 27);
		Vertex lop = g.addVertex(T.label, "lop", "email", "lop@net.at", "lang",
				"java");
		Vertex josh = g.addVertex(T.label, "josh", "email", "josh@net.at",
				"age", 32);
		Vertex ripple = g.addVertex(T.label, "ripple", "email",
				"ripple@net.at", "lang", "java");
		Vertex peter = g.addVertex(T.label, "peter", "email", "peter@net.at",
				"age", 35);

		marko.addEdge("knows", vadas, "weight", 0.5f);
		marko.addEdge("knows", josh, "weight", 1.0f);
		marko.addEdge("created", lop, "weight", 0.4f);
		josh.addEdge("created", ripple, "weight", 1.0f);
		josh.addEdge("created", lop, "weight", 0.4f);
		peter.addEdge("created", lop, "weight", 0.2f);
	}

	@AfterClass
	public static void shutdown() throws Exception {
		g.close();
	}

	@Ignore
	@Test
	public void testGraphSetup() {
		Vertex m = g.v(0L);
		System.out.println("testGraphSetup: " + m.out("knows").next().label());
	}

	@Ignore
	@Test
	public void testGraphSetup1() {
		GraphTraversal<Vertex, Element> m = g.V().has("age");

		while (m.hasNext()) {
			Element x = m.next();
			System.out.println("testGraphSetup1: " + x.toString());
			System.out.println("testGraphSetup1: " + x.id());
			System.out.println("testGraphSetup1: " + x.label());
			System.out.println("testGraphSetup1: " + x.keys().toString());
		}
	}

	@Ignore
	@Test
	public void testGraphSetup2() {
		GraphTraversal<Vertex, String> m = g.V().map(
				new Function<Traverser<Vertex>, String>() {

					@Override
					public String apply(Traverser<Vertex> t) {
						Element x = t.get();
						String ret = "label: " + x.label() + " email: "
								+ x.value("email");
						return ret;
					}
				});

		while (m.hasNext()) {
			String x = m.next();
			System.out.println("testGraphSetup2: " + x.toString());
		}
	}

	@Ignore
	@Test
	public void testGraphSetup3() {
		GraphTraversal<Vertex, String> m = g.V().has("age")
				.map(new Function<Traverser<Element>, String>() {

					@Override
					public String apply(Traverser<Element> t) {
						Element x = t.get();
						String ret = "label: " + x.label() + " age: "
								+ x.value("age") + " email: "
								+ x.value("email");
						return ret;
					}
				});

		while (m.hasNext()) {
			String x = m.next();
			System.out.println("testGraphSetup3: " + x.toString());
		}
	}
}
