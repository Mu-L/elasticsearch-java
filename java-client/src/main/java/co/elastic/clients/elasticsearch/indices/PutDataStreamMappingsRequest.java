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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: indices.put_data_stream_mappings.Request

/**
 * Update data stream mappings.
 * <p>
 * This API can be used to override mappings on specific data streams. These
 * overrides will take precedence over what is specified in the template that
 * the data stream matches. The mapping change is only applied to new write
 * indices that are created during rollover after this API is called. No indices
 * are changed by this API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.put_data_stream_mappings.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDataStreamMappingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Time masterTimeout;

	private final List<String> name;

	@Nullable
	private final Time timeout;

	private final TypeMapping mappings;

	// ---------------------------------------------------------------------------------------------

	private PutDataStreamMappingsRequest(Builder builder) {

		this.dryRun = builder.dryRun;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.unmodifiableRequired(builder.name, this, "name");
		this.timeout = builder.timeout;
		this.mappings = ApiTypeHelper.requireNonNull(builder.mappings, this, "mappings");

	}

	public static PutDataStreamMappingsRequest of(Function<Builder, ObjectBuilder<PutDataStreamMappingsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the request does not actually change the mappings on
	 * any data streams. Instead, it simulates changing the settings and reports
	 * back to the user what would have happened had these settings actually been
	 * applied.
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public final Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - A comma-separated list of data streams or data stream patterns.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * The period to wait for a response. If no response is received before the
	 * timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Request body.
	 */
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.mappings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataStreamMappingsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutDataStreamMappingsRequest> {
		@Nullable
		private Boolean dryRun;

		@Nullable
		private Time masterTimeout;

		private List<String> name;

		@Nullable
		private Time timeout;

		private TypeMapping mappings;

		/**
		 * If <code>true</code>, the request does not actually change the mappings on
		 * any data streams. Instead, it simulates changing the settings and reports
		 * back to the user what would have happened had these settings actually been
		 * applied.
		 * <p>
		 * API name: {@code dry_run}
		 */
		public final Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - A comma-separated list of data streams or data stream patterns.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of data streams or data stream patterns.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Request body.
		 */
		public final Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			TypeMapping value = (TypeMapping) TypeMapping._DESERIALIZER.deserialize(parser, mapper);
			return this.mappings(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDataStreamMappingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataStreamMappingsRequest build() {
			_checkSingleUse();

			return new PutDataStreamMappingsRequest(this);
		}
	}

	public static final JsonpDeserializer<PutDataStreamMappingsRequest> _DESERIALIZER = createPutDataStreamMappingsRequestDeserializer();
	protected static JsonpDeserializer<PutDataStreamMappingsRequest> createPutDataStreamMappingsRequestDeserializer() {

		JsonpDeserializer<TypeMapping> valueDeserializer = TypeMapping._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.mappings(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_data_stream_mappings}".
	 */
	public static final Endpoint<PutDataStreamMappingsRequest, PutDataStreamMappingsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_data_stream_mappings",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_mappings");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutDataStreamMappingsResponse._DESERIALIZER);
}
