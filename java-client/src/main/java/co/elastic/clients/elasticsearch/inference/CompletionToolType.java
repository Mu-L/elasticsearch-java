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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
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

// typedef: inference._types.CompletionToolType

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CompletionToolType">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionToolType implements TaggedUnion<CompletionToolType.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Object, String

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private CompletionToolType(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private CompletionToolType(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CompletionToolType of(Function<Builder, ObjectBuilder<CompletionToolType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code object}?
	 */
	public boolean isObject() {
		return _kind == Kind.Object;
	}

	/**
	 * Get the {@code object} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code object} kind.
	 */
	public CompletionToolChoice object() {
		return TaggedUnionUtils.get(this, Kind.Object);
	}

	/**
	 * Is this variant instance of kind {@code string}?
	 */
	public boolean isString() {
		return _kind == Kind.String;
	}

	/**
	 * Get the {@code string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string} kind.
	 */
	public String string() {
		return TaggedUnionUtils.get(this, Kind.String);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case String :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CompletionToolType> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<CompletionToolType> object(CompletionToolChoice v) {
			this._kind = Kind.Object;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CompletionToolType> object(
				Function<CompletionToolChoice.Builder, ObjectBuilder<CompletionToolChoice>> fn) {
			return this.object(fn.apply(new CompletionToolChoice.Builder()).build());
		}

		public ObjectBuilder<CompletionToolType> string(String v) {
			this._kind = Kind.String;
			this._value = v;
			return this;
		}

		public CompletionToolType build() {
			_checkSingleUse();
			return new CompletionToolType(this);
		}

	}

	private static JsonpDeserializer<CompletionToolType> buildCompletionToolTypeDeserializer() {
		return new UnionDeserializer.Builder<CompletionToolType, Kind, Object>(CompletionToolType::new, false)
				.addMember(Kind.Object, CompletionToolChoice._DESERIALIZER)
				.addMember(Kind.String, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<CompletionToolType> _DESERIALIZER = JsonpDeserializer
			.lazy(CompletionToolType::buildCompletionToolTypeDeserializer);
}
