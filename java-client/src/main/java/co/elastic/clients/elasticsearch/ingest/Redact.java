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

package co.elastic.clients.elasticsearch.ingest;

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

// typedef: ingest._types.Redact

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.Redact">API
 *      specification</a>
 */
@JsonpDeserializable
public class Redact implements JsonpSerializable {
	private final boolean isRedacted;

	// ---------------------------------------------------------------------------------------------

	private Redact(Builder builder) {

		this.isRedacted = ApiTypeHelper.requireNonNull(builder.isRedacted, this, "isRedacted", false);

	}

	public static Redact of(Function<Builder, ObjectBuilder<Redact>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - indicates if document has been redacted
	 * <p>
	 * API name: {@code _is_redacted}
	 */
	public final boolean isRedacted() {
		return this.isRedacted;
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

		generator.writeKey("_is_redacted");
		generator.write(this.isRedacted);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Redact}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Redact> {
		private Boolean isRedacted;

		/**
		 * Required - indicates if document has been redacted
		 * <p>
		 * API name: {@code _is_redacted}
		 */
		public final Builder isRedacted(boolean value) {
			this.isRedacted = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Redact}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Redact build() {
			_checkSingleUse();

			return new Redact(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Redact}
	 */
	public static final JsonpDeserializer<Redact> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Redact::setupRedactDeserializer);

	protected static void setupRedactDeserializer(ObjectDeserializer<Redact.Builder> op) {

		op.add(Builder::isRedacted, JsonpDeserializer.booleanDeserializer(), "_is_redacted");

	}

}
