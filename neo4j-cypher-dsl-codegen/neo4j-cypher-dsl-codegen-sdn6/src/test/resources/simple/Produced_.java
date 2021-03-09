package org.neo4j.cypherdsl.codegen.sdn6.models.valid.simple;

import javax.annotation.Generated;
import org.neo4j.cypherdsl.core.MapExpression;
import org.neo4j.cypherdsl.core.Node;
import org.neo4j.cypherdsl.core.Properties;
import org.neo4j.cypherdsl.core.RelationshipBase;
import org.neo4j.cypherdsl.core.SymbolicName;

@Generated(
		value = "org.neo4j.cypherdsl.codegen.core.RelationshipImplBuilder",
		date = "2019-09-21T21:21:00+01:00",
		comments = "This class is generated by the Neo4j Cypher-DSL. All changes to it will be lost after regeneration."
)
public final class Produced_ extends RelationshipBase<Person_, Movie_, Produced_> {
	public Produced_(Person_ start, Movie_ end) {
		super(start, "produced", end);
	}

	private Produced_(SymbolicName symbolicName, Node start, String type, Properties properties,
			Node end) {
		super(symbolicName, start, type, properties, end);
	}

	@Override
	public Produced_ named(SymbolicName newSymbolicName) {
		return new Produced_(newSymbolicName, getLeft(), getRequiredType(), getDetails().getProperties(), getRight());
	}

	@Override
	public Produced_ withProperties(MapExpression newProperties) {
		return new Produced_(getSymbolicName().orElse(null), getLeft(), getRequiredType(), Properties.create(newProperties), getRight());
	}
}