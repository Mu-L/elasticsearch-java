/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: cluster.allocation_explain.Request

/**
 * Explain the shard allocations. Get explanations for shard allocations in the
 * cluster. This API accepts the current_node, index, primary and shard
 * parameters in the request body or in query parameters, but not in both at the
 * same time. For unassigned shards, it provides an explanation for why the
 * shard is unassigned. For assigned shards, it provides an explanation for why
 * the shard is remaining on its current node and has not moved or rebalanced to
 * another node. This API can be very useful when attempting to diagnose why a
 * shard is unassigned or why a shard continues to remain on its current node
 * when you might expect otherwise. Refer to the linked documentation for
 * examples of how to troubleshoot allocation issues using this API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster.allocation_explain.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class AllocationExplainRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String currentNode;

	@Nullable
	private final Boolean includeDiskInfo;

	@Nullable
	private final Boolean includeYesDecisions;

	@Nullable
	private final String index;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Boolean primary;

	@Nullable
	private final Integer shard;

	// ---------------------------------------------------------------------------------------------

	private AllocationExplainRequest(Builder builder) {

		this.currentNode = builder.currentNode;
		this.includeDiskInfo = builder.includeDiskInfo;
		this.includeYesDecisions = builder.includeYesDecisions;
		this.index = builder.index;
		this.masterTimeout = builder.masterTimeout;
		this.primary = builder.primary;
		this.shard = builder.shard;

	}

	public static AllocationExplainRequest of(Function<Builder, ObjectBuilder<AllocationExplainRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Explain a shard only if it is currently located on the specified node name or
	 * node ID.
	 * <p>
	 * API name: {@code current_node}
	 */
	@Nullable
	public final String currentNode() {
		return this.currentNode;
	}

	/**
	 * If true, returns information about disk usage and shard sizes.
	 * <p>
	 * API name: {@code include_disk_info}
	 */
	@Nullable
	public final Boolean includeDiskInfo() {
		return this.includeDiskInfo;
	}

	/**
	 * If true, returns YES decisions in explanation.
	 * <p>
	 * API name: {@code include_yes_decisions}
	 */
	@Nullable
	public final Boolean includeYesDecisions() {
		return this.includeYesDecisions;
	}

	/**
	 * The name of the index that you would like an explanation for.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Period to wait for a connection to the master node.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * If true, returns an explanation for the primary shard for the specified shard
	 * ID.
	 * <p>
	 * API name: {@code primary}
	 */
	@Nullable
	public final Boolean primary() {
		return this.primary;
	}

	/**
	 * An identifier for the shard that you would like an explanation for.
	 * <p>
	 * API name: {@code shard}
	 */
	@Nullable
	public final Integer shard() {
		return this.shard;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.currentNode != null) {
			generator.writeKey("current_node");
			generator.write(this.currentNode);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.primary != null) {
			generator.writeKey("primary");
			generator.write(this.primary);

		}
		if (this.shard != null) {
			generator.writeKey("shard");
			generator.write(this.shard);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationExplainRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AllocationExplainRequest> {
		@Nullable
		private String currentNode;

		@Nullable
		private Boolean includeDiskInfo;

		@Nullable
		private Boolean includeYesDecisions;

		@Nullable
		private String index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Boolean primary;

		@Nullable
		private Integer shard;

		/**
		 * Explain a shard only if it is currently located on the specified node name or
		 * node ID.
		 * <p>
		 * API name: {@code current_node}
		 */
		public final Builder currentNode(@Nullable String value) {
			this.currentNode = value;
			return this;
		}

		/**
		 * If true, returns information about disk usage and shard sizes.
		 * <p>
		 * API name: {@code include_disk_info}
		 */
		public final Builder includeDiskInfo(@Nullable Boolean value) {
			this.includeDiskInfo = value;
			return this;
		}

		/**
		 * If true, returns YES decisions in explanation.
		 * <p>
		 * API name: {@code include_yes_decisions}
		 */
		public final Builder includeYesDecisions(@Nullable Boolean value) {
			this.includeYesDecisions = value;
			return this;
		}

		/**
		 * The name of the index that you would like an explanation for.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If true, returns an explanation for the primary shard for the specified shard
		 * ID.
		 * <p>
		 * API name: {@code primary}
		 */
		public final Builder primary(@Nullable Boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * An identifier for the shard that you would like an explanation for.
		 * <p>
		 * API name: {@code shard}
		 */
		public final Builder shard(@Nullable Integer value) {
			this.shard = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AllocationExplainRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationExplainRequest build() {
			_checkSingleUse();

			return new AllocationExplainRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationExplainRequest}
	 */
	public static final JsonpDeserializer<AllocationExplainRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AllocationExplainRequest::setupAllocationExplainRequestDeserializer);

	protected static void setupAllocationExplainRequestDeserializer(
			ObjectDeserializer<AllocationExplainRequest.Builder> op) {

		op.add(Builder::currentNode, JsonpDeserializer.stringDeserializer(), "current_node");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.allocation_explain}".
	 */
	public static final Endpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cluster.allocation_explain",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_cluster/allocation/explain";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.includeDiskInfo != null) {
					params.put("include_disk_info", String.valueOf(request.includeDiskInfo));
				}
				if (request.includeYesDecisions != null) {
					params.put("include_yes_decisions", String.valueOf(request.includeYesDecisions));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, AllocationExplainResponse._DESERIALIZER);
}
