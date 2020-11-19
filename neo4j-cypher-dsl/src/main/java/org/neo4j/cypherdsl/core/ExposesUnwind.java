/*
 * Copyright (c) 2019-2020 "Neo4j,"
 * Neo4j Sweden AB [https://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypherdsl.core;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

import org.apiguardian.api.API;

/**
 * A step exposing a {@link #unwind(Expression...)},{@link #unwind(Expression)}, {@link #unwind(String)} and method.
 *
 * @author Michael J. Simons
 * @since 1.0
 */
@API(status = EXPERIMENTAL, since = "1.0")
public interface ExposesUnwind {

	/**
	 * Starts building a new {@code UNWIND} clause.
	 *
	 * @param expressions The things to unwind.
	 * @return An ongoing definition of an unwind.
	 */
	default StatementBuilder.OngoingUnwind unwind(Expression... expressions) {
		return unwind(Cypher.listOf(expressions));
	}

	/**
	 * Starts building a new {@code UNWIND} clause.
	 *
	 * @param variable The thing to unwind.
	 * @return An ongoing definition of an unwind.
	 */
	default StatementBuilder.OngoingUnwind unwind(String variable) {
		return unwind(Cypher.name(variable));
	}

	/**
	 * Starts building a new {@code UNWIND} clause.
	 *
	 * @param expression The things to unwind.
	 * @return An ongoing definition of an unwind.
	 */
	StatementBuilder.OngoingUnwind unwind(Expression expression);
}
