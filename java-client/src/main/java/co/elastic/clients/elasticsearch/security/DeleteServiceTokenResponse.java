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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: security.delete_service_token.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.delete_service_token.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteServiceTokenResponse implements JsonpSerializable {
	private final boolean found;

	// ---------------------------------------------------------------------------------------------

	private DeleteServiceTokenResponse(Builder builder) {

		this.found = ApiTypeHelper.requireNonNull(builder.found, this, "found", false);

	}

	public static DeleteServiceTokenResponse of(Function<Builder, ObjectBuilder<DeleteServiceTokenResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - If the service account token is successfully deleted, the request
	 * returns <code>{&quot;found&quot;: true}</code>. Otherwise, the response will
	 * have status code 404 and <code>found</code> is set to <code>false</code>.
	 * <p>
	 * API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
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

		generator.writeKey("found");
		generator.write(this.found);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteServiceTokenResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DeleteServiceTokenResponse> {
		private Boolean found;

		/**
		 * Required - If the service account token is successfully deleted, the request
		 * returns <code>{&quot;found&quot;: true}</code>. Otherwise, the response will
		 * have status code 404 and <code>found</code> is set to <code>false</code>.
		 * <p>
		 * API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteServiceTokenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteServiceTokenResponse build() {
			_checkSingleUse();

			return new DeleteServiceTokenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteServiceTokenResponse}
	 */
	public static final JsonpDeserializer<DeleteServiceTokenResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteServiceTokenResponse::setupDeleteServiceTokenResponseDeserializer);

	protected static void setupDeleteServiceTokenResponseDeserializer(
			ObjectDeserializer<DeleteServiceTokenResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");

	}

}
