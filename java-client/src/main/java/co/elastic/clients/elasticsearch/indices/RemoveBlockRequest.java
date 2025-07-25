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
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
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

// typedef: indices.remove_block.Request

/**
 * Remove an index block.
 * <p>
 * Remove an index block from an index. Index blocks limit the operations
 * allowed on an index by blocking specific operation types.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.remove_block.Request">API
 *      specification</a>
 */

public class RemoveBlockRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final IndicesBlockOptions block;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final String index;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private RemoveBlockRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.block = ApiTypeHelper.requireNonNull(builder.block, this, "block");
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public static RemoveBlockRequest of(Function<Builder, ObjectBuilder<RemoveBlockRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices. For example, a request targeting <code>foo*,bar*</code> returns an
	 * error if an index starts with <code>foo</code> but no index starts with
	 * <code>bar</code>.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Required - The block type to remove from the index.
	 * <p>
	 * API name: {@code block}
	 */
	public final IndicesBlockOptions block() {
		return this.block;
	}

	/**
	 * The type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. It supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - A comma-separated list or wildcard expression of index names used
	 * to limit the request. By default, you must explicitly name the indices you
	 * are removing blocks from. To allow the removal of blocks from indices with
	 * <code>_all</code>, <code>*</code>, or other wildcard expressions, change the
	 * <code>action.destructive_requires_name</code> setting to <code>false</code>.
	 * You can update this setting in the <code>elasticsearch.yml</code> file or by
	 * using the cluster update settings API.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. It can
	 * also be set to <code>-1</code> to indicate that the request should never
	 * timeout.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The period to wait for a response from all relevant nodes in the cluster
	 * after updating the cluster metadata. If no response is received before the
	 * timeout expires, the cluster metadata update still applies but the response
	 * will indicate that it was not completely acknowledged. It can also be set to
	 * <code>-1</code> to indicate that the request should never timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoveBlockRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RemoveBlockRequest> {
		@Nullable
		private Boolean allowNoIndices;

		private IndicesBlockOptions block;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		private String index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices. For example, a request targeting <code>foo*,bar*</code> returns an
		 * error if an index starts with <code>foo</code> but no index starts with
		 * <code>bar</code>.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Required - The block type to remove from the index.
		 * <p>
		 * API name: {@code block}
		 */
		public final Builder block(IndicesBlockOptions value) {
			this.block = value;
			return this;
		}

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Required - A comma-separated list or wildcard expression of index names used
		 * to limit the request. By default, you must explicitly name the indices you
		 * are removing blocks from. To allow the removal of blocks from indices with
		 * <code>_all</code>, <code>*</code>, or other wildcard expressions, change the
		 * <code>action.destructive_requires_name</code> setting to <code>false</code>.
		 * You can update this setting in the <code>elasticsearch.yml</code> file or by
		 * using the cluster update settings API.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. It can
		 * also be set to <code>-1</code> to indicate that the request should never
		 * timeout.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. It can
		 * also be set to <code>-1</code> to indicate that the request should never
		 * timeout.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * will indicate that it was not completely acknowledged. It can also be set to
		 * <code>-1</code> to indicate that the request should never timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * will indicate that it was not completely acknowledged. It can also be set to
		 * <code>-1</code> to indicate that the request should never timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoveBlockRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoveBlockRequest build() {
			_checkSingleUse();

			return new RemoveBlockRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.remove_block}".
	 */
	public static final Endpoint<RemoveBlockRequest, RemoveBlockResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.remove_block",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _block = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _block;

				if (propsSet == (_index | _block)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_block");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.block.jsonValue(), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;
				final int _block = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _block;

				if (propsSet == (_index | _block)) {
					params.put("index", request.index);
					params.put("block", request.block.jsonValue());
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, RemoveBlockResponse._DESERIALIZER);
}
