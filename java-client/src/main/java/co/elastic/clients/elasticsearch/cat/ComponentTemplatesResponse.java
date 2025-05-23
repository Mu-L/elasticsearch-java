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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.component_templates.ComponentTemplate;
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
import jakarta.json.stream.JsonParser;
import java.util.List;
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

// typedef: cat.component_templates.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cat.component_templates.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ComponentTemplatesResponse implements JsonpSerializable {
	private final List<ComponentTemplate> componentTemplates;

	// ---------------------------------------------------------------------------------------------

	private ComponentTemplatesResponse(Builder builder) {

		this.componentTemplates = ApiTypeHelper.unmodifiableRequired(builder.componentTemplates, this,
				"componentTemplates");

	}

	public static ComponentTemplatesResponse of(Function<Builder, ObjectBuilder<ComponentTemplatesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<ComponentTemplate> componentTemplates() {
		return this.componentTemplates;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (ComponentTemplate item0 : this.componentTemplates) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplatesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ComponentTemplatesResponse> {
		private List<ComponentTemplate> componentTemplates;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>componentTemplates</code>.
		 */
		public final Builder componentTemplates(List<ComponentTemplate> list) {
			this.componentTemplates = _listAddAll(this.componentTemplates, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>componentTemplates</code>.
		 */
		public final Builder componentTemplates(ComponentTemplate value, ComponentTemplate... values) {
			this.componentTemplates = _listAdd(this.componentTemplates, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>componentTemplates</code> using a builder lambda.
		 */
		public final Builder componentTemplates(
				Function<ComponentTemplate.Builder, ObjectBuilder<ComponentTemplate>> fn) {
			return componentTemplates(fn.apply(new ComponentTemplate.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<ComponentTemplate> value = (List<ComponentTemplate>) JsonpDeserializer
					.arrayDeserializer(ComponentTemplate._DESERIALIZER).deserialize(parser, mapper);
			return this.componentTemplates(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ComponentTemplatesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplatesResponse build() {
			_checkSingleUse();

			return new ComponentTemplatesResponse(this);
		}
	}

	public static final JsonpDeserializer<ComponentTemplatesResponse> _DESERIALIZER = createComponentTemplatesResponseDeserializer();
	protected static JsonpDeserializer<ComponentTemplatesResponse> createComponentTemplatesResponseDeserializer() {

		JsonpDeserializer<List<ComponentTemplate>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(ComponentTemplate._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.componentTemplates(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
