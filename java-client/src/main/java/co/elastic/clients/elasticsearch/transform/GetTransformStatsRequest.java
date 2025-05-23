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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
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

// typedef: transform.get_transform_stats.Request

/**
 * Get transform stats.
 * <p>
 * Get usage information for transforms.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.get_transform_stats.Request">API
 *      specification</a>
 */

public class GetTransformStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Long from;

	@Nullable
	private final Long size;

	@Nullable
	private final Time timeout;

	private final List<String> transformId;

	// ---------------------------------------------------------------------------------------------

	private GetTransformStatsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.size = builder.size;
		this.timeout = builder.timeout;
		this.transformId = ApiTypeHelper.unmodifiableRequired(builder.transformId, this, "transformId");

	}

	public static GetTransformStatsRequest of(Function<Builder, ObjectBuilder<GetTransformStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ol>
	 * <li>Contains wildcard expressions and there are no transforms that
	 * match.</li>
	 * <li>Contains the _all string or no identifiers and there are no matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ol>
	 * <p>
	 * If this parameter is false, the request returns a 404 status code when there
	 * are no matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Skips the specified number of transforms.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Long from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of transforms to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Long size() {
		return this.size;
	}

	/**
	 * Controls the time to wait for the stats
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Identifier for the transform. It can be a transform identifier or
	 * a wildcard expression. You can get information for all transforms by using
	 * <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;transform_id&gt;</code>, or by omitting the
	 * <code>&lt;transform_id&gt;</code>.
	 * <p>
	 * API name: {@code transform_id}
	 */
	public final List<String> transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetTransformStatsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Long from;

		@Nullable
		private Long size;

		@Nullable
		private Time timeout;

		private List<String> transformId;

		/**
		 * Specifies what to do when the request:
		 * <ol>
		 * <li>Contains wildcard expressions and there are no transforms that
		 * match.</li>
		 * <li>Contains the _all string or no identifiers and there are no matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ol>
		 * <p>
		 * If this parameter is false, the request returns a 404 status code when there
		 * are no matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Skips the specified number of transforms.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Long value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of transforms to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Long value) {
			this.size = value;
			return this;
		}

		/**
		 * Controls the time to wait for the stats
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Controls the time to wait for the stats
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Identifier for the transform. It can be a transform identifier or
		 * a wildcard expression. You can get information for all transforms by using
		 * <code>_all</code>, by specifying <code>*</code> as the
		 * <code>&lt;transform_id&gt;</code>, or by omitting the
		 * <code>&lt;transform_id&gt;</code>.
		 * <p>
		 * API name: {@code transform_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>transformId</code>.
		 */
		public final Builder transformId(List<String> list) {
			this.transformId = _listAddAll(this.transformId, list);
			return this;
		}

		/**
		 * Required - Identifier for the transform. It can be a transform identifier or
		 * a wildcard expression. You can get information for all transforms by using
		 * <code>_all</code>, by specifying <code>*</code> as the
		 * <code>&lt;transform_id&gt;</code>, or by omitting the
		 * <code>&lt;transform_id&gt;</code>.
		 * <p>
		 * API name: {@code transform_id}
		 * <p>
		 * Adds one or more values to <code>transformId</code>.
		 */
		public final Builder transformId(String value, String... values) {
			this.transformId = _listAdd(this.transformId, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTransformStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformStatsRequest build() {
			_checkSingleUse();

			return new GetTransformStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.get_transform_stats}".
	 */
	public static final Endpoint<GetTransformStatsRequest, GetTransformStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.get_transform_stats",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/_stats");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _transformId = 1 << 0;

				int propsSet = 0;

				propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					params.put("transformId",
							request.transformId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetTransformStatsResponse._DESERIALIZER);
}
